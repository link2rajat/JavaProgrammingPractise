package com.Rajat.pack2;
import java.util.ArrayList;
class Util
{
static void sleep(long millis)
{
try {
	Thread.sleep(millis);
}
catch (InterruptedException e) 
{
e.printStackTrace();
}	
}
}
class ModelThread extends Thread
{
public synchronized void goToWait()
{
	try {
		wait();
	} 
	catch (InterruptedException e) 
	{
     e.printStackTrace();	
	}
}
public synchronized void release() 
{
notify();	
}
public void run() 
{
while (true)
{
goToWait();
for (int i = 0; i < 10; i++)
{
System.out.println(getName()+":"+i);
Util.sleep(1000);
}
release();
}
}
}
class ThredPoolManager
{
private ArrayList pool = new ArrayList();
public void init()
{
	ModelThread th = new ModelThread();
	for (int i = 0; i < 10; i++)
	{
	th = new ModelThread();
	th.start();
	pool.add(th);
	
	}
}
public ModelThread getThread()
{
ModelThread th = null;
if (pool.size()>0)
{
	th = (ModelThread)pool.remove(0);
} 
else
{
th = new ModelThread();
th.start();
}
return th;
}
public void setThread(ModelThread th)
{
if (pool.size()<10)
{
	pool.add(th);
} 
else
{
th.stop();
th = null;
}	
}
public void release()
{
	ModelThread th = null;
	for (int i = 0; i < pool.size();)
	{
		th = (ModelThread)pool.remove(0);
		th.stop();
	}
}
}
class User1 extends Thread
{
ThredPoolManager pm = null;
public User1(ThredPoolManager pm)
{
this.pm = pm;
}
public void run()
	{
	while (true)
	{
		ModelThread th = new ModelThread();
		th.release();
		th.goToWait();
		pm.setThread(th);
		Util.sleep(1000);
	}
	}
}

class User2 extends Thread
{
ThredPoolManager pm = null;
public User2(ThredPoolManager pm)
{
this.pm = pm;
}
public void run()
	{
	while (true)
	{
		ModelThread th = new ModelThread();
		th.release();
		th.goToWait();
		pm.setThread(th);
		Util.sleep(1000);
	}
	}
}

class User3 extends Thread
{
ThredPoolManager pm = null;
public User3(ThredPoolManager pm)
{
this.pm = pm;
}
public void run()
	{
	while (true)
	{
		ModelThread th = new ModelThread();
		th.release();
		th.goToWait();
		pm.setThread(th);
		Util.sleep(1000);
	}
	}
}
public class Manager 
{ 

public static void main(String[] args)
{
	ThredPoolManager pm = new ThredPoolManager();
	pm.init();
	User1 u1 = new User1(pm);
	User2 u2 = new User2(pm);
	User3 u3 = new User3(pm);
	u1.start();
	u2.start();
	u3.start();
Util.sleep(500000);
u1.stop();
u2.stop();
u3.stop();
pm.release();
System.out.println("End of the Game");
}
}
