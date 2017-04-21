package com.Rajat.Tree;

import java.util.TreeMap;

public class Manager1
{
public static void main(String[] args)
{
	TreeMap map = new TreeMap();
	map.put(90, "abc");
	map.put(9, "xyz");
	map.put(0, "hi");
	map.put(910, "test");
	map.put(50, "java");
	map.put(2, "j2ee");
	System.out.println(map);
	System.out.println(map.ceilingKey(45));
	System.out.println(map.floorKey(45));
	System.out.println(map.headMap(100));
	System.out.println(map.headMap(90));
	System.out.println(map.tailMap(90));
	System.out.println(map.headMap(90, true));
	System.out.println(map.tailMap(90, true));
	
	
}
}
