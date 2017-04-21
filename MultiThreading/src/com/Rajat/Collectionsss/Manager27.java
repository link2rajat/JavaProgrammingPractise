package com.Rajat.Collectionsss;

import java.util.TreeSet;

class J implements Comparable
{
int i;
public J(int i)
{
this.i = i;
}
public String toString()
	{
		return "i="+i;
	}
public int compareTo(Object obj)
	{
		return i - ((J)obj).i;
	}

}
public class Manager27
{
public static void main(String[] args)
{
	TreeSet set = new TreeSet();
	set.add(new J(9));
	set.add(new J(1));
	set.add(new J(5));
	set.add(new J(4));
	System.out.println(set);
}
}
