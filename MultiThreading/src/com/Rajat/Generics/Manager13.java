package com.Rajat.Generics;
class T<A>
{
A a1;	
}
public class Manager13
{
public static void main(String[] args)
{
	T<?>t1 = null;
	t1 = new T<Integer>();
	t1 = new T<Number>();
	t1 = new T<Object>();
	t1 = new T<String>();
	t1 = new T<S>();
	T<? extends Number>t2 = null;
	t2 = new T<Integer>();
	t2 = new T<Number>();
	//t2 = new T<Object>();
	//t2 = new T<String>();
	//t2 = new T<S>();
	T<? super Number>t3 = null;
	//t3 = new T<Integer>();
	t3 = new T<Number>();
	t3 = new T<Object>();
	//t3 = new T<String>();
	//t3 = new T<S>();
	T<? extends R>t4 = null;
	//t4 = new T<P>();
	//t4 = new T<Q>();
	t4 = new T<R>();
	t4 = new T<S>();
	//t4 = new T<Object>();
	//t4 = new T<String>();
	T<? super Q>t5 = null;
	t5 = new T<P>();
	t5 = new T<Q>();
	//t5 = new T<R>();
	//t5 = new T<S>();
	t5 = new T<Object>();
	//t5 = new T<String>();
	
	
	System.out.println("done");
	
}
}
