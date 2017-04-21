package com.Rajat.ThreadStates;
class A extends Thread
{
public void run()
{
for (int i = 0; i < 3000; i++)
{
System.out.println(i);	
}
}	
}
public class Manager2
{
public static void main(String[] args)
{
	A a1 = new A();
	System.out.println("a:"+a1.getState());
	a1.start();
	System.out.println("b:"+a1.getState());
	try
	{
		Thread.sleep(1);
	} catch (InterruptedException e)
	{
		System.out.println(e);
	}
	System.out.println("c:"+a1.getState());
	try
	{
		Thread.sleep(100000);
	}
	catch (InterruptedException e)
	{
	System.out.println(e);
	}
	System.out.println("d:"+a1.getState());

}
}
