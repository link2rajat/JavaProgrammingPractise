package com.Rajat.Collectionsss;

import java.util.Collections;
import java.util.TreeSet;

public class Manager25
{
public static void main(String[] args)
{
	TreeSet set = new TreeSet(Collections.reverseOrder());
	set.add("hello");
	set.add("abc");
	set.add("test");
	set.add("done");
	set.add("check");
	System.out.println(set);
} 
}
