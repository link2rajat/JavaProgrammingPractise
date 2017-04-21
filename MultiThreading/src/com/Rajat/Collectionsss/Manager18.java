package com.Rajat.Collectionsss;

import java.util.HashSet;

public class Manager18
{
public static void main(String[] args)
{
	HashSet set1 = new HashSet();
	set1.add("abc");
	set1.add("abc");
	System.out.println(set1);
	HashSet set2 = new HashSet();
	set2.add(90);
	set2.add(90);
	System.out.println(set2);
	HashSet set3 = new HashSet();
	set3.add(true);
	set3.add(true);
	System.out.println(set3);
	HashSet set4 = new HashSet();
	set4.add(new StringBuffer("abc"));
	set4.add(new StringBuffer("abc"));
	System.out.println(set4);
	HashSet set5 = new HashSet();
	set5.add(new A(10));
	set5.add(new A(10));
	System.out.println(set5);
	
}
}
