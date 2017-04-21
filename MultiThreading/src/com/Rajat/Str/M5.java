package com.Rajat.Str;

public class M5
{
public static void main(String[] args)
{
	String s1 = "abc;123;xyz;hello";
	String x[]=s1.split(";");
	for (String obj : x)
	{
		System.out.println(obj);
	}
}
}
