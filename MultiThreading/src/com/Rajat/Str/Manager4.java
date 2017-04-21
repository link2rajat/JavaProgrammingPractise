package com.Rajat.Str;

import java.lang.reflect.Method;

class E
{
public void test() 
{
	System.out.println("test");
}	
}
public class Manager4
{
	public static void main(String[] args) throws Exception
	{
	Class c1 = Class.forName("com.Rajat.Str.E");
	Object obj = c1.newInstance();
	Method m1 = c1.getDeclaredMethod("test");
	m1.invoke(obj);
	System.out.println("done");
	
	}

}
