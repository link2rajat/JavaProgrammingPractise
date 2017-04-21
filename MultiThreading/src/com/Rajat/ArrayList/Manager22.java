package com.Rajat.ArrayList;

import java.util.ArrayList;
import java.util.Collections;

class B
{
	int i;
B(int i)
{
this.i =i;
}
@Override
public String toString()
{
return "i ="+i;
}

}
public class Manager22
{
public static void main(String[] args)
{
	ArrayList list = new ArrayList();
	list.add(new B(9));
	list.add(new B(4));
	list.add(new B(5));
	list.add(new B(2));
	Collections.sort(list);
	System.out.println(list);
}
}
