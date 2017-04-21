package com.Rajat;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class ManagerClient 
{
public static void main(String[] args) 
{
	Configuration config = new Configuration();
	config.configure();
	SessionFactory sf = config.buildSessionFactory();
	Session s1 = sf.openSession();
	Person p1 = (Person)s1.load(Person.class, 101);
	Person p2 = (Person)s1.load(Person.class, 102);
	Person p3 = (Person)s1.load(Person.class, 101);
	
	System.out.println("----------");
	System.out.println(p1.getId());
	System.out.println(p1.getFirstname());
	System.out.println(p1.getLastname());
	System.out.println(p1.getAge());
	
	System.out.println("----------");
	System.out.println(p2.getId());
	System.out.println(p2.getFirstname());
	System.out.println(p2.getLastname());
	System.out.println(p2.getAge());
	
	System.out.println("----------");
	System.out.println(p3.getId());
	System.out.println(p3.getFirstname());
	System.out.println(p3.getLastname());
	System.out.println(p3.getAge());
	
	System.out.println("-----------");
	System.out.println(p1==p2);
	System.out.println(p2==p3);
	System.out.println(p3==p1);
	
	
	
}
}
