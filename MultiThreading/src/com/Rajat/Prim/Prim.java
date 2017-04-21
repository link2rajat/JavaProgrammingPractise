package com.Rajat.Prim;

import java.io.*;

class Prim
{
	public static BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		
	static int [][] G;
	static int [][] t;
	static int [] near;
	
	static int n;
	static int mincost = 0;
	static int k, l;
	
	public static void main (String[] args) throws IOException
	{
		System.out.println("\t\t\t\tPrim's Algorithm");
		
		System.out.print("\nEnter the number of the vertices: ");
		n = Integer.parseInt(br.readLine());
		
		G = new int[n+1][n+1];
		t = new int[n+1][3];
		
		near = new int[n+1];
		
		System.out.print("\nIf edge between the following vertices enter its cost (not more than 7000) else 0:\n");
		for(int i=1;i<=n;i++)
			for(int j=1;j<=n;j++)
			{
				if((i!=j)&&(i<j))
				{
					System.out.print(i+" and "+j+": ");
					G[j][i] = G[i][j] = Integer.parseInt(br.readLine());
					if(G[i][j] == 0 )
						G[j][i] = G[i][j] = 7001;
				}
				if(i==j)
					G[i][j]=7001;
			}
			
		prims();
		System.out.println("\n\nSolution : \n\n");

		for (int i = 1; i<=n; i++)
		{
			if( (t[i][1]!=0) && (t[i][2] !=0) )
				System.out.println(t[i][1] + "-" +t[i][2]);
		}
		System.out.println("\n\n\n\n Minimum cost incured is: "+ mincost);
	}

	static void prims()
	{
		getMinKL();
		mincost = G[k][l];
		t[1][1] = l;
		t[1][2] = k;
		for(int i=1; i<=n; i++)
			near[i] = (G[i][l]<G[i][k])?l:k;
		near[k] = near[l] = 0;
		
		for(int i=2; i<n; i++)
		{
			int j = getMin();
			t[i][1] = j; t[i][2] = near[j];
			mincost = mincost+G[j][near[j]];
			near[j] =0;
			for (int k=1; k<=n; k++)
				if( (near[k] !=0) && G[k][ near[k] ]> G[k][j] )
					near[k] =j;
		}
	}
	
	static int getMin()
	{
		int j=1;
		for(int i=1;i<=n;i++)
			if(near[i] !=0)
			{
				j = i;
				break;
			}
		
		for(int i=1;i<=n;i++)
			if(near[i] !=0)
				if(G[j][near[j]]> G[i][near[i]])
					j =i;
		return j;
	}
	
	static void getMinKL()
	{
		int k1 = 1, l1 = 2;
		for(int i=1;i<=n;i++)
			for(int j=1;j<=n;j++)
			{
				if((i!=j)&&(i<j))
				{
					if((G[i][j] < G[k1][l1]) && G[i][j] !=0 )
					{
						k1 = i;
						l1 = j;
					}
				}
			}
		if(G[k1][l1] !=0 )
		{
			k =k1; l=l1;
		}
	}
}