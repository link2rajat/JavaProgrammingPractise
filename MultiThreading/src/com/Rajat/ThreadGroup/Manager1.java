package com.Rajat.ThreadGroup;
class A11
{
	
}
class B11 extends Thread
{
	public void run()
	{
	System.out.println("runn-B");
	}
}
class C11 extends A11 implements Runnable
{
	public void run()
	{
	System.out.println("runn-C");
	}
	}
public class Manager1
{
public static void main(String[] args)
{
	B11 b1 = new B11();
	b1.start();
	B11 b2 = new B11();
	b2.start();
	C11 c1 = new C11();
	Thread t1 = new Thread();
	Thread t2 = new Thread();
	t1.start();
	t2.start();
}
}
