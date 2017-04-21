package com.Rajat.ArrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Manager40
{
public static void main(String[] args)
{
	ArrayList list = new ArrayList();
	list.add(90);
	list.add(0);
	list.add(9);
	list.add(91);
	list.add(8);
	list.add(7);
	ListIterator it = list.listIterator();
	while (it.hasNext())
	{
    Object obj = it.next();
    if (obj.equals(91))
	{
		it.set("abc");
	}
    System.out.println(obj+",");
	}
	System.out.println();
	System.out.println(list);
	
}
}
