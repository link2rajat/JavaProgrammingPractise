package com.Rajat.Collectionsss;

import java.util.HashSet;

class I
{
int i,j;
public I(int i,int j)
{
this.i =i;
this.j =j;
}
public boolean equals(Object obj)
	{
	return (obj instanceof I && 
			i ==((I)obj).i);
	}
public int hashCode()
	{
		return Integer.toString(i).hashCode();
	}
	}
public class Manager22
{
public static void main(String[] args)
{
	HashSet s = new HashSet();
	s.add(new I(1,2));
	s.add(new I(1,3));
	s.add(new I(1,5));
	s.add(new I(2,1));
	System.out.println(s.size());
}
}
