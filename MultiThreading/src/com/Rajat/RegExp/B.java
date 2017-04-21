package com.Rajat.RegExp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class B
{
public static void main(String[] args)
{
	String s1 = "abcxyz123pqr2km9rt";
	Pattern p1 = Pattern.compile("\\d+");
	Matcher m1 = p1.matcher(s1);
	while (m1.find())
	{
	System.out.println(m1.start()+":"+m1.group());	
	}
}
}
