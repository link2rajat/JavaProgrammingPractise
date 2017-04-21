package com.Rajat.Obj;

public class B implements Cloneable
{
int i;
public static void main(String[] args) throws CloneNotSupportedException
{
B b1 = new B();
b1.i = 10;
B b2 = (B)b1.clone();
System.out.println(b2.i);
b2.i = 20;
System.out.println(b1.i);
b1.i = 30;
System.out.println(b2.i);
System.out.println(b1.i);
}
}
