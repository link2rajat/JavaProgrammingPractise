package com.Rajat.Dates;

import java.text.NumberFormat;
import java.util.Locale;

public class G
{
public static void main(String[] args)
{
	double d1 = 102929.8789789;
	System.out.println(d1);
	NumberFormat nf1 = NumberFormat.getCurrencyInstance(Locale.UK);
	String s1 = nf1.format(d1);
	System.out.println(s1);
}
}
