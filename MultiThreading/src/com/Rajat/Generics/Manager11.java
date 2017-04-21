package com.Rajat.Generics;
class T<A extends Number>
{
A i;	
}
public class Manager11
{
public static void main(String[] args)
{
	T<Integer>t1 = new T<Integer>();
	T<Double>t2 = new T<Double>();
	System.out.println("done");
	
	
}
}
