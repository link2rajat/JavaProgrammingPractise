package com.Rajat.Generics;
class V<A>
{
A i;	
}
public class Manager14
{
static void test1(V <?> obj)
{
	
}
static void test2(V <? extends Number> obj)
{
	
}
static void test3(V <? super Number> obj)
{
	
}

static void test4(V <?> obj)
{
	
}
static void test5(V <? extends Q> obj)
{
	
}
static void test6(V <? super Q> obj)
{
	
}
public static void main(String[] args)
{
	test1(new V<Object>());
	test1(new V<Integer>());
	test1(new V<P>());
	test1(new V<R>());
	
	//test2(new V<Object>());
	test2(new V<Integer>());
	//test2(new V<P>());
	//test2(new V<R>());
	
	test3(new V<Object>());
	//test3(new V<Integer>());
	//test3(new V<P>());
	//test3(new V<R>());
	
	test4(new V<Object>());
	test4(new V<Integer>());
	test4(new V<P>());
	test4(new V<R>());
	
	//test5(new V<Object>());
	//test5(new V<Integer>());
	//test5(new V<P>());
	test5(new V<R>());
	
	test6(new V<Object>());
	//test6(new V<Integer>());
	test6(new V<P>());
	//test6(new V<R>());
	System.out.println("done");
}
}
