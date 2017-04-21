package com.Rajat.Collectionsss;

import java.util.PriorityQueue;

class A implements Comparable
{
	int i;
	public A(int i)
	{
	this.i = i;
	}
	public int compareTo(Object obj)
	{
		return i - ((A)obj).i;
	}
	public String toString()
	{
		return Integer.toString(i);
	}
}
public class Manager11
{
public static void main(String[] args)
{
	PriorityQueue q = new PriorityQueue();
	q.add(new A(9));
	q.add(new A(5));
	q.add(new A(8));
	q.add(new A(29));
	q.add(new A(90));
	q.add(new A(19));
	q.add(new A(1));
	System.out.println(q);
	System.out.println(q.poll());
	System.out.println(q);
	System.out.println(q.poll());
	System.out.println(q);
	System.out.println(q.poll());
	System.out.println(q);
	
	
	
	
	
	
}
}
