package com.Rajat;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Manager1 
{
public static void main(String[] args) 
{
	Configuration config = new Configuration();
	config.configure();
	SessionFactory sf = config.buildSessionFactory();
	Session s1 = sf.openSession();
	Session s2 = sf.openSession();
	Person p1 = (Person)s1.load(Person.class, 101);
	Person p2 = (Person)s2.load(Person.class, 101);
	System.out.println(p1==p2);
	System.out.println(s1==s2);
}
}
