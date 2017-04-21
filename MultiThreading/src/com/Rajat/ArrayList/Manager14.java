package com.Rajat.ArrayList;

import java.util.ArrayList;

public class Manager14 extends ArrayList
{
public static void main(String[] args)
{
	Manager14 list1 = new Manager14();
	list1.add(1);
	list1.add(0);
	list1.add(3);
	list1.add(4);
	list1.add(7);
	list1.add(9);
	list1.add(10);
	list1.add(20);
	list1.add(8);
	System.out.println(list1);
	list1.removeRange(2, 6);
	System.out.println(list1);
	
}
}
