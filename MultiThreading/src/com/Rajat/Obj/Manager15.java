package com.Rajat.Obj;
class W
{
int i;
String s1;
public W(int i,String s1)
{
this.i =i;
this.s1 =s1;
}
public int hashCode()
	{
String s1 = Integer.toString(i);
int hash = s1.hashCode();
hash+=s1.hashCode();
return hash;
	}
}

public class Manager15
{
	public static void main(String[] args)
	{
		W w1 = new W(10,"abc");
		W w2 = new W(10,"abc");
		System.out.println(w1.hashCode());
		System.out.println(w2.hashCode());
	}

}
