package com.Rajat.Collectionsss;

import java.util.LinkedList;

public class Manager4
{
public static void main(String[] args)
{
LinkedList list = new LinkedList();
list.add("abc");
list.add("cba");
list.add("test");
list.add("hello");
list.add("java");
list.add("10");
System.out.println(list);
Object obj = list.removeLast();
System.out.println(obj);
System.out.println(list);
Object obj1 = list.removeLast();
System.out.println(obj1);
System.out.println(list);

}
}
