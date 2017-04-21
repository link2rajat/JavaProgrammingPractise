package com.Rajat.Collectionsss;

import java.util.HashSet;
import java.util.Iterator;

public class Manager15
{
public static void main(String[] args)
{
	HashSet set = new HashSet();
	set.add(90);
	set.add(9);
	set.add(0);
	set.add(190);
	set.add(40);
System.out.println(set);
Iterator it = set.iterator();
while (it.hasNext())
{
 System.out.print(it.next()+",");
	
}
}
}
