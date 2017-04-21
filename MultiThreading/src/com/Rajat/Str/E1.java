package com.Rajat.Str;

public class E1
{
public static void main(String[] args)
{
	StringBuffer sb = new StringBuffer();
	System.out.println(sb.capacity());
	sb.append("abcabcabcabcabcabcabc");
	System.out.println(sb);
	System.out.println(sb.length());
	System.out.println(sb.capacity());
	System.out.println("-----------");
	sb.append("abcabcabcabcabcabcabc");
	System.out.println(sb);
	System.out.println(sb.length());
	System.out.println(sb.capacity());
	System.out.println("-----------");
	sb.trimToSize();
	System.out.println(sb.capacity());
	System.out.println(sb.length());
		
}
}
