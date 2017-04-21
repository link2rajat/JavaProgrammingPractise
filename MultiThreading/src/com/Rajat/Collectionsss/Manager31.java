package com.Rajat.Collectionsss;

import java.util.HashMap;

public class Manager31
{
public static void main(String[] args)
{
	HashMap map1 = new HashMap();
	map1.put("abc", 2000);
	map1.put("key1", 5000);
	map1.put("key2", "value1");
	map1.put(9090, "value2");
	System.out.println(map1.get("key2"));
	System.out.println(map1.get(9090));
	System.out.println(map1.get("xyz"));
}
}
