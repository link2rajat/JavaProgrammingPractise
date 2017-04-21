package com.Rajat.Generics;
class E<A,B>
{
A i,j;
B m,n;
String p,q;
}
public class Manager4
{
public static void main(String[] args)
{
	E<String, String>e1 = new E<String, String>();
	E<Integer,String>e2 = new E<Integer, String>();
	e1.i = "abc";
	e1.j = "abc";
	e1.m = "abc";
	e1.n = "abc";
	e1.p = "abc";
	e1.q = "abc";
	System.out.println(e1.i);
	System.out.println(e1.j);
	System.out.println(e1.m);
	System.out.println(e1.n);
	System.out.println(e1.p);
	System.out.println(e1.q);
	
	e2.i = 90;
	e2.j = 100;
	e2.m = "abc";
	e2.n = "abc";
	e2.p = "abc";
	e2.q = "abc";

	System.out.println(e2.i);
	System.out.println(e2.j);
	System.out.println(e2.m);
	System.out.println(e2.n);
	System.out.println(e2.p);
	System.out.println(e2.q);

}
}
