package com.Rajat.Obj;
class V
{
int i,j;
public V(int i,int j)
{
this.i =i;
this.j =j;
}
public String toString()
	{
	return "i ="+i+",j=" +j;	
	}
public boolean equals(Object obj)
	{
	return (obj instanceof V && 
			i==((V)obj).i&&
			i==((V)obj).j);
	}
public int hashCode()
	{
String s1 = Integer.toString(i);
String s2 = Integer.toString(j);
int hash = s1.hashCode();
hash+=s2.hashCode();
return hash;
	}
}

public class Manager14
{
	public static void main(String[] args)
	{
		V v1 = new V(10,40);
		V v2 = new V(10,40);
		System.out.println(v1);
		System.out.println(v2);
		System.out.println(v1.equals(v2));
		System.out.println(v1.hashCode());
		System.out.println(v2.hashCode());
	}

}
