package com.Rajat.Collectionsss;

import java.util.HashMap;

public class Manager32
{
public static void main(String[] args)
{
	HashMap map1 = new HashMap();
	map1.put(null, 1000);
	map1.put("abc", null);
	map1.put("test", "done");
	map1.put("key2", "value1");
	System.out.println(map1);
	}
}
