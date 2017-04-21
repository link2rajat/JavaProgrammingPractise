package com.Rajat.ThreadStates;
class C extends Thread
{
public synchronized void run()
{
System.out.println("begin");
try
{
wait();

}
catch (InterruptedException e)
{
e.printStackTrace();
}
System.out.println("end");
}	
}
public class Manager4
{
public static void main(String[] args)
{
	C c1 = new C();
	c1.start();
	try
	{
		Thread.sleep(5000);
	} catch (InterruptedException e)
	{
		System.out.println(e);		
	}
	System.out.println(c1.getState());
synchronized (c1)
{
	c1.notify();
}
}
}
