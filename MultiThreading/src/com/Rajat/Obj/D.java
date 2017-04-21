package com.Rajat.Obj;

import java.util.Scanner;

public class D
{
public static void main(String[] args) throws ClassNotFoundException
{
	Scanner sc = new Scanner(System.in);
	System.out.println(1);
	System.out.println("Enter Age");
	int age = sc.nextInt();
	if (age<=0)
	{
		throw new ArithmeticException("Age is +ve");
	}
	System.out.println(2);
}
}
