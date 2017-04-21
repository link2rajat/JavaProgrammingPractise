package com.Rajat.Collectionsss1;

import java.util.TreeMap;

class A implements Comparable
{
int i;
public A(int i)
{
this.i =i;
}
	public String toString()
	{
		return "(i="+i+")";
	}
	public int compareTo(Object obj)
		{
			return i - ((A)obj).i;
		}
	
}
public class Manager3
{
public static void main(String[] args)
{
	TreeMap map = new TreeMap();
	map.put(new A(9), "abc1");
	map.put(new A(90), "abc2");
	map.put(new A(5), "abc3");
	System.out.println(map);	
}
}
