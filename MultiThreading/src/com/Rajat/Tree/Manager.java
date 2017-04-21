package com.Rajat.Tree;

import java.util.TreeSet;

public class Manager
{
public static void main(String[] args)
{
	TreeSet set1 = new TreeSet();
	set1.add(50);
	set1.add(5);
	set1.add(10);
	set1.add(15);
	set1.add(30);
	set1.add(35);
	set1.add(25);
	set1.add(40);
	set1.add(38);
	set1.add(20);
	System.out.println(set1);
	System.out.println(set1.ceiling(13));
	System.out.println(set1.floor(13));
	System.out.println(set1.ceiling(15));
	System.out.println(set1.floor(15));
	System.out.println(set1.headSet(22));
	System.out.println(set1.headSet(25));
	System.out.println(set1.headSet(25,true));
	System.out.println(set1.headSet(25,false));
	System.out.println(set1.tailSet(30));
	System.out.println(set1.tailSet(30,false));
	System.out.println(set1.higher(33));
}
}
