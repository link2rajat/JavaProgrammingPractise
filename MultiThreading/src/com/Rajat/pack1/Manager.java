package com.Rajat.pack1;
class Thread1 extends Thread
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

public class Manager
{public static void main(String[] args) 
{
	Thread1 t1 = new Thread1();
	t1.start();
	try {
		Thread.sleep(20000);
	} 
	catch (InterruptedException e) 
	{
	e.printStackTrace();
	}
	synchronized (t1) 
	{
	t1.notify();	
	}
}
	
}
