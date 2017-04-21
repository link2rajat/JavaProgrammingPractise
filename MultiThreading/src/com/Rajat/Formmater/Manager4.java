package com.Rajat.Formmater;

public class Manager4
{
enum E
{
CON,X(90),Y("ABC"),Z(90);
private E(int i)
{
	// TODO Auto-generated constructor stub
}
}
public static void main(String[] args)
{
	E e1 = E.X;
	System.out.println(e1);
	E e2 = E.Z;
	System.out.println(e2);
	System.out.println(e1.ordinal());
	System.out.println(e2.ordinal());
	
}
}
