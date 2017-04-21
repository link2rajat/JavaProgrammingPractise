package com.Rajat.Collectionsss;

import java.util.HashSet;

class F
{
int i,j;
public F(int i,int j)
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
	return (obj instanceof F && 
			i==((F)obj).i&&
			i==((F)obj).j);
	}
public int hashCode()
	{
String s1 = Integer.toString(i);
String s2 = Integer.toString(j);
int hash = s1.hashCode();
hash+=s2.hashCode();
return hash;
	}
}
public class Manager20
{
public static void main(String[] args)
{
	HashSet s = new HashSet();
	s.add(new F(1,2));
	s.add(new F(2,1));
	System.out.println(s);
}
}
