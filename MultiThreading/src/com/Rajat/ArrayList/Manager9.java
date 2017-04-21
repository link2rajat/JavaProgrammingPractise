package com.Rajat.ArrayList;

import java.util.ArrayList;

public class Manager9
{
public static void main(String[] args)
{
ArrayList list = new ArrayList();
list.add(9);
list.add(0);
list.add(4);
list.add(6);
list.add(8);
list.add(2);
list.add(1);
list.add(3);
System.out.println(list);
Object obj = list.remove(3);
System.out.println(list);
System.out.println(obj);
obj = list.remove(10);
System.out.println(obj);
}
}
