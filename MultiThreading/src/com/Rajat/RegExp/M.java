package com.Rajat.RegExp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class M
{
public static void main(String[] args)
{
	String s1 = "a1b2c3d4";
	String x[] = s1.split("2");
	for (String string : x)
	{
		System.out.println(string);
	}
	
}
}
