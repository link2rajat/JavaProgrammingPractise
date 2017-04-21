package com.Rajat.ArrayList;

import java.util.ArrayList;

public class Manager4
{
public static void main(String[] args)
{
	ArrayList list = new ArrayList();
	list.add(90);
	list.add(9.0);
	list.add(190);
	list.add("abc");
	
	System.out.println(list);
	for (int i = 0; i < list.size(); i++)
	{
	System.out.println(list.get(i)+",");	
	}
System.out.println();
System.out.println("--------");
for (Object object : list)
{
	System.out.println(object+",");
}
System.out.println();
System.out.println("--------");

}
}
