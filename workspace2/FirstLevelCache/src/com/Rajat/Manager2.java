package com.Rajat;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Manager2 
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
	
	s1.beginTransaction();
	p1.setFirstname("changed");
	s1.update(p1);
	p1.setLastname("first");
	s1.update(p1);
	s1.getTransaction().commit();
	
	s2.beginTransaction();
	p1.setFirstname("changed");
	s1.update(p1);
	p2.setLastname("first");
	s2.update(p1);
	s2.getTransaction().commit();
	
	s1.flush();
	s1.close();
	s2.flush();
	s2.close();
	System.out.println("done");
	
}
}
