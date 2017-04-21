package com.Rajat.Collectionsss;

import java.util.LinkedList;

class Stack
{
private LinkedList list = new LinkedList();
public void add(Object obj)
{
list.add(obj);	
}
public Object processElement()
{
return list.removeLast();
}
	public String toString()
	{
     return list.toString();
	}
}
public class Manager7
{
public static void main(String[] args)
{
	Stack s1 = new Stack();
s1.add("abc");
s1.add("xyz");
s1.add("hello");
s1.add(123);
s1.add("done");
System.out.println(s1);
Object o1 = s1.processElement();
System.out.println(o1);
System.out.println(s1);
Object o2 = s1.processElement();
System.out.println(o2);
System.out.println(s1);
}
}
