package com.Rajat;

import org.hibernate.Session;

public class Manager2 
{
	public static void main(String[] args) 
	{
		Session s1 = Util.getSession();
		Person p1 = (Person)s1.get(Person.class, 101);
		System.out.println("==============");
		System.out.println(p1.getId());
		System.out.println(p1.getFirstname());
		System.out.println(p1.getLastname());
		System.out.println(p1.getAge());
		System.out.println("===============");

	}
}



