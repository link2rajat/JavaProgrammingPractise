package com.Rajat.ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Manager17
{
public static void main(String[] args)
{
	ArrayList list1 = new ArrayList();
	list1.add(9);
	list1.add(19);
	list1.add(91);
	list1.add(29);
	list1.add(2);
	list1.add(25);
	System.out.println(list1);
	Comparator ctr = Collections.reverseOrder();
	Collections.sort(list1,ctr);
	System.out.println(list1);
	}
}