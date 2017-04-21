package com.Rajat.Tree;

import java.util.HashMap;

public class ThreadLocal
{
private HashMap map = new HashMap();
public void set(Object obj)
{
Thread th = Thread.currentThread();
long id = th.getId();
map.put(id, obj);
}
public Object get()
{
	Thread th = Thread.currentThread();
	long id = th.getId();
	return map.get(id);
	
	
}
}
