package com.Rajat.ArrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Manager36
{
public static void main(String[] args)
{
	ArrayList list = new ArrayList();
	list.add(90);
	list.add(9);
	list.add(0);
	list.add(40);
	ListIterator lit = list.listIterator();
	while (lit.hasNext())
	{
		System.out.println(lit.next()+",");
	}
	System.out.println();
	System.out.println("--------");
	while (lit.hasPrevious())
	{
		System.out.println(lit.previous()+",");
	}
	System.out.println();
	System.out.println("--------");
	while (lit.hasNext())
	{
		System.out.println(lit.next()+",");
	}
	System.out.println();
	System.out.println("--------");
	
	
}
}
