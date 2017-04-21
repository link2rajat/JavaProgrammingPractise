package com.Rajat.Collectionsss1;
public class LinkedList
{
private Element front,back;
public void add(Object o1)
{
	Element e = new Element();
	e.data = o1;
	if(front == null)
	{
		front = e;
	}
	else
	{
		back.next = e;
	}
	back = e;
}
public void iterate()
{
Element e = front;
while(e != null)
{
System.out.println(e.data);
    e = e.next;
}
}
class Element
{
Element next;
Object data;
}
}

