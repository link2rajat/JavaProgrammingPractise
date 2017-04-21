package com.Rajat.Generics;
interface M<A>
{
void test1(A a1);
A test2(A a1);
}
class N<Y> implements M<Y>
{
public void test1(Y y1 )
{
	
}
public Y test2(Y y1)
{
return y1;	
}
}
public class Manager10
{
public static void main(String[] args)
{
	N<String> n1 = new N<String>();
	n1.test1("abc");
	String s1 = n1.test2("xyz");
	N<Integer>n2 = new N<Integer>();
	n2.test1(10);
	int i = n2.test2(100);
	System.out.println("done" +s1+i);
}
}
