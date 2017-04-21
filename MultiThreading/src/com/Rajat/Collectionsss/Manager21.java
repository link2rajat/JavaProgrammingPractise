package com.Rajat.Collectionsss;

import java.util.HashSet;

class G
{
int i,j;
public G(int i,int j)
{
this.i =i;
this.j =j;
}
public String toString()
	{
	return "("+i+"," +j+")";	
	}
public boolean equals(Object obj)
	{
	System.out.println("equals");
	return (obj instanceof G && 
			i==((G)obj).i&&
			i==((G)obj).j);
	}
public int hashCode()
	{
	System.out.println("hashCode");
String s1 = Integer.toString(i);
String s2 = Integer.toString(j);
int hash = s1.hashCode();
hash+=s2.hashCode();
return hash;
	}
}
public class Manager21
{
public static void main(String[] args)
{
	HashSet s = new HashSet();
	s.add(new G(1,1));
	s.add(new G(1,1));
	s.add(new G(2,1));
	s.add(new G(1,2));
	System.out.println(s.size());
}
}
