package com.Rajat.Generics;

class I<X>
{
X f;	
}
public class Manager8
{
public static void main(String[] args)
{
	I ob = new I();
	I<String> ob2 = new I<String>();
	ob.f = new Object();
	ob2.f = "abc";
	System.out.println("done");
		
}
}
