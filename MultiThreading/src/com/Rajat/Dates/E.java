package com.Rajat.Dates;
import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

public class E
{
public static void main(String[] args)
{
Date d1 = new Date();
System.out.println(d1);
DateFormat df = DateFormat.getDateInstance(DateFormat.SHORT,new Locale("it"));
String s1 = df.format(d1);
System.out.println(s1);
}
}
