package com.Rajat.ThreadStates.ChildTh1;


class Util
{
static void sleep(long millis)
{
try
{
  Thread.sleep(millis);
} 
catch (InterruptedException e)
{
e.printStackTrace();	
}	
}
}
class A extends Thread
{
ThreadLocal t;
A(ThreadLocal t)
{
	this.t = t;
}
public void run()
	{
System.out.println("1:"+t.get());
t.set(10);
Util.sleep(500);
System.out.println("2:"+t.get());
t.set(20);
Util.sleep(500);
System.out.println("3:"+t.get());
t.set(30);
Util.sleep(500);
System.out.println("4:"+t.get());
t.set(40);
	}
}
class B extends Thread
{
ThreadLocal t;
B(ThreadLocal t)
{
	this.t = t;
}
public void run()
	{
System.out.println("5:"+t.get());
t.set(50);
Util.sleep(500);
System.out.println("6:"+t.get());
t.set(60);
Util.sleep(500);
System.out.println("7:"+t.get());
t.set(70);
Util.sleep(500);
System.out.println("8:"+t.get());
t.set(80);
	}
}
public class Manager
{
public static void main(String[] args)
{
	ThreadLocal t1 = new ThreadLocal();
	t1.set(90);
	A a1 = new A(t1);
	a1.start();
	Util.sleep(250);
	B b1 = new B(t1);
	b1.start();
	Util.sleep(40000);
	System.out.println("9:"+t1.get());

}
}
