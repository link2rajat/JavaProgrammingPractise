package com.Rajat.Arrays;

public class Q
{
public static void main(String[] args)
{
	new Q();
	//{10,20,30,40};
	new int[]{10,7,40,50};
	//test({10,20});
	test(new int[]{10,7,40,50});
}
static void test(int[] x)
{
System.out.println(x.length);
for (int i : x)
{
	System.out.println(i);
}
}
}
