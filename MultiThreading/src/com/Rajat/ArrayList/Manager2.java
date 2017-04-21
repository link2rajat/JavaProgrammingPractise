
package com.Rajat.ArrayList;

import java.util.ArrayList;

public class Manager2
{
public static void main(String[] args)
{
	ArrayList list1 = new ArrayList();
	list1.add(90);
	list1.add(true);
    int i = (Integer)list1.get(0);
    boolean flag = (Boolean)list1.get(1);
	System.out.println(i);
	System.out.println(flag);
    System.out.println(list1);
	
}
}
