package com.Rajat.Collectionsss;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class Manager35
{
public static void main(String[] args)
{
	HashMap map1 = new HashMap();
	map1.put("abc", "v1");
	map1.put("key", "v2");
	map1.put("key1", "v21");
	map1.put("key2", "v22");
	map1.put("key3", "v23");
	map1.put("key4", "v24");
    Set set = map1.keySet();
    Iterator it = set.iterator();
    Object key,value;
    while (it.hasNext())
	{
		key = it.next();
		value = map1.get(key);
		System.out.println(key+":"+value);
		
	}
}
}
