package com.Rajat.RegExp;

import java.util.StringTokenizer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P
{
public static void main(String[] args)
{
	StringTokenizer st = new StringTokenizer("a1b2c3d4","\\d");
	while (st.hasMoreElements())
	{
	System.out.println(st.nextElement()); 
		
	}
	
}
}
