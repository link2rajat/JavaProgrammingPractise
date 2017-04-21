package com.Rajat.ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class Manager19
{
public static void main(String[] args)
{
	ArrayList list1 = new ArrayList();
	list1.add("abc");
	list1.add("aBC");
	list1.add("ABC");
	list1.add("abc");
	list1.add("Abc");
	list1.add("123");
	System.out.println(list1);
	Collections.sort(list1);
	System.out.println(list1);
	}
}