package com.Rajat.Generics;
class H<X>
{
X i;
public H()
{
	// TODO Auto-generated constructor stub
}
H(X i)
{
this.i = i;

}
public void set(X i)
{
	this.i = i;
}
X get()
{
return i;	
}
}
public class Manager7
{
public static void main(String[] args)
{
H<String>h1 = new H<String>();
h1.set("abc");
H<Integer>h2 = new H<Integer>(90);
String s1 = h1.get();
int i = h2.get();
System.out.println(s1);
System.out.println(i);
}
}
