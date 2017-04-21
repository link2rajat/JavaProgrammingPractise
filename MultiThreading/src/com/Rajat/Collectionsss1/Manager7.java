package com.Rajat.Collectionsss1;

import java.util.TreeMap;

class D implements Comparable
{
int i;
public D(int i)
{
this.i =i;
}
	public String toString()
	{
		return "(i="+i+")";
	}
	public int compareTo(Object obj)
		{
			return i - ((D)obj).i;
		}
	@Override
		public int hashCode()
		{
			return Integer.toString(i).hashCode();
		}
	@Override
		public boolean equals(Object obj)
		{
			return i == ((D)obj).i;
		}
	
}
public class Manager7
{
public static void main(String[] args)
{
	TreeMap map = new TreeMap();
	map.put(new D(9), "abc1");
	map.put(new D(9), "abc2");
	map.put(new D(9), "abc3");
	map.put(new D(90), "abc4");
	map.put(new D(0), "abc5");
	map.put(new D(80), "abc6");
	System.out.println(map);	
}
}
