package com.Rajat.Collectionsss;
import java.util.Comparator;
import java.util.PriorityQueue;
class B 
{
int i,j;
B(int i,int j)
{
this.i = i;
this.j = j;
}
	public String toString()
	{
    return "("+i+ ","+j+")";
	}
}
class C implements Comparator
{
	public int compare(Object o1,Object o2)
	{
	return ((B)o1).i - ((B)o2).i;
	}
	
}

class D implements Comparator
{
	public int compare(Object o1,Object o2)
	{
	return ((B)o1).j - ((B)o2).j;
	}
	
}
public class Manager12
{
public static void main(String[] args)
{
	PriorityQueue q = new PriorityQueue(10,new C());
	q.add(new B(1,2));
	q.add(new B(10,0));
	q.add(new B(5,8));
	q.add(new B(0,10));
	q.add(new B(2,5));
	q.add(new B(8,6));
	System.out.println(q);
	System.out.println(q.poll());
	System.out.println(q);
	System.out.println(q.poll());
	System.out.println(q);
	System.out.println(q.poll());
	System.out.println(q);
	System.out.println("-------------");
	PriorityQueue q1 = new PriorityQueue(10,new D());
	q1.add(new B(1,2));
	q1.add(new B(10,0));
	q1.add(new B(5,8));
	q1.add(new B(0,10));
	q1.add(new B(2,5));
	q1.add(new B(8,6));
	System.out.println(q1);
	System.out.println(q1.poll());
	System.out.println(q1);
	System.out.println(q1.poll());
	System.out.println(q1);
	System.out.println(q1.poll());
	System.out.println(q1);

}
}
