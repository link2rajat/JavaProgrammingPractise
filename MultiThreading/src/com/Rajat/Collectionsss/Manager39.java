package com.Rajat.Collectionsss;

import java.util.HashSet;
import java.util.Hashtable;

class P
{
int i;
public P(int i)
{
this.i =i;
}
	public String toString()
	{
		return "(i="+i+")";
	}
}
class Q
{
int i;
public Q(int i)
{
this.i =i;
}
public String toString()
{
	return "(i="+i+")";
}
public boolean equals(Object obj)
	{
	return (obj instanceof Q && 
			i ==((Q)obj).i);
	}
public int hashCode()
	{
		return Integer.toString(i).hashCode();
	}
}
public class Manager39
{
public static void main(String[] args)
{
	Hashtable map = new Hashtable();
	map.put(90, "e1");
	map.put(90, "e2");
	map.put("abc", "v1");
	map.put("abc", "v2");
	map.put(new P(9), "hello1");
	map.put(new P(9), "hello2");
	map.put(new Q(9), "hello3");
	map.put(new Q(9), "hello4");
	map.put(new StringBuffer("abc"), "hello4");
	map.put(new StringBuffer("abc"), "hello5");
System.out.println(map);	
}
}
