package com.Rajat.Generics;

class G<E>
{
E at;
G(E at,int i)
{
this.at = at;
}
}
public class Manager6
{
public static void main(String[] args)
{
	G<String>g1 = new G<String>("abc", 20);
	G<Integer>g2 = new G<Integer>(40, 20);
	G<Double>g3 = new G<Double>(4.9, 20);
	System.out.println("done");
	
}
}
