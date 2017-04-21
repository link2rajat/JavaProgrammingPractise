package com.Rajat.Generics;

class X<A>
{
	void test(A ob)
	{
		
	}
}
public class Manager16
{
public static void main(String[] args)
{
	X<?>x1 = null;
	//x1.test(10);
	//x1.test(new P());
    //x1.test("abc");
	X<? extends Number>x2 = null;
    //x2.test(10);
	X<? super Number>x3 = null;
	x3.test(10.0);
	X< ? super R>x4 = null;
	x4.test(new S());
System.out.println("done");
	
}
}
