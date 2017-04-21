package com.Rajat.Collectionsss1;

import java.util.HashMap;
import java.util.TreeMap;

public class Manager1
{
public static void main(String[] args)
{
	HashMap map = new HashMap();
	map.put("key", 2000);
	map.put("abc", 2300);
	map.put("hello", 2050);
	map.put("done", 9090);
	map.put("check", 9190);
	map.put("test", 9030);
	map.put("java", 9091);
	System.out.println(map);
	TreeMap map1 = new TreeMap(map);
	System.out.println(map1);
}
}
