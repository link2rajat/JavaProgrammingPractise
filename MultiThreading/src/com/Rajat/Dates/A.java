package com.Rajat.Dates;

import java.util.Calendar;
import java.util.Date;

public class A
{
public static void main(String[] args)
{
	Calendar c1 = Calendar.getInstance();
	c1.add(Calendar.YEAR,-2);
	Date d1 = c1.getTime();
	System.out.println(d1);
}
}
