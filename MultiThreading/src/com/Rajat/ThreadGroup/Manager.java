package com.Rajat.ThreadGroup;
class A extends Thread
{
A(ThreadGroup tg,String name)
{
super(tg,name);	
}

public void run()
	{
for (int i = 0; i < 1000; i++)
{
	System.out.println(i);
}	
	}
}
class B implements Runnable
{
public void run()
{
for (int i = 1000; i < 2000; i++)
{
	System.out.println(i);
}
}	
}
public class Manager
{
@SuppressWarnings("deprecation")
public static void main(String[] args)
{
	ThreadGroup tg = new ThreadGroup("first group");
	A a1 = new A(tg,"first thread");
	A a2 = new A(tg,"2nd thread");
	B b1 = new B();
	Thread t1 = new Thread(tg,b1,"3rd thread");
	Thread t2 = new Thread(tg,b1,"4th thread");
a1.start();
a2.start();
t1.start();
t2.start();
tg.stop();
}
}
