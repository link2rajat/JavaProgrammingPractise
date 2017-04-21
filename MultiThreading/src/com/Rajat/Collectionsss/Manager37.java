package com.Rajat.Collectionsss;

import java.util.HashMap;
import java.util.Hashtable;

class M
{
int i;
public M(int i)
{
this.i = i;
}
@Override
	public String toString()
	{
		return "(i="+i+")";
	}
}
public class Manager37
{
public static void main(String[] args)
{
	Hashtable map = new Hashtable();
	map.put(10, "abc");
	map.put(null, "xyz");
	map.put("k1", 200);
	map.put("k1", "test");
	map.put(new M(10), 100);
	map.put(new M(10), 200);
System.out.println(map);	
}
}
