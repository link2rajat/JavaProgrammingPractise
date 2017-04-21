package com.Rajat.Generics;

class C <X>
{
X i;	
}
public class manager2
{
public static void main(String[] args)
{
C <String>c1 = new C<String>();	
c1.i = "abc";
C<Integer>c2 = new C<Integer>();
c2.i = 90;
C<Double>c3 = new C<Double>();
c3.i = 9.90;
System.out.println(c1.i);
System.out.println(c2.i);
System.out.println(c3.i);
System.out.println("done");
}
}
