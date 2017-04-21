package com.Rajat.Collectionsss;
import java.util.Comparator;
import java.util.TreeSet;
class L 
{
int i,j;
L(int i,int j)
{
this.i = i;
this.j = j;
}
	public String toString()
	{
    return "("+i+ ","+j+")";
	}

static class A1 implements Comparator
{
	public int compare(Object o1,Object o2)
	{
	return ((L)o1).i - ((L)o2).i;
	}
	
}

static class B1 implements Comparator
{
	public int compare(Object o1,Object o2)
	{
	return ((L)o1).j - ((L)o2).j;
	}
	
}
}
public class Manager29
{
public static void main(String[] args)
{
	TreeSet q = new TreeSet(new L.A1());
	TreeSet q1 = new TreeSet(new L.B1());

	q.add(new L(1,0));
	q.add(new L(2,1));
	q.add(new L(0,4));
	q.add(new L(5,2));
	q.add(new L(4,3));
	System.out.println(q);
	q1.add(new L(1,0));
	q1.add(new L(2,1));
	q1.add(new L(0,4));
	q1.add(new L(5,2));
	q1.add(new L(4,3));
	System.out.println(q1);
	
}
}
