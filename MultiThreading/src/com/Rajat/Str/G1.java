package com.Rajat.Str;

public class G1
{
public static void main(String[] args)
{
StringBuffer sb = new StringBuffer();
sb.append("abc");
sb.append("xyz");
sb.append("rst");
System.out.println(sb);
sb.delete(3, 6);
System.out.println(sb);
}
}
