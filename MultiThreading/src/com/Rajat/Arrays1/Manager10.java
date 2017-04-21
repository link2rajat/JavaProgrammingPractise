package com.Rajat.Arrays1;

public class Manager10
{
public static void main(String[] args)
{
	int []x[] = new int[3][];
	x[0] = new int[2];
	x[1] = new int[4];
	x[2] = new int[3];
	System.out.println(x[1][1]);
	x[2][2] = 100;
	System.out.println(x[0][0]);
}
}
