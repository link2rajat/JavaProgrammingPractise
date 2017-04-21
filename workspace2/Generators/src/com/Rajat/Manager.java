package com.Rajat;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Manager 
{
public static void main(String[] args) 
{
	Configuration config = new Configuration();
	config.configure();
	SessionFactory sf = config.buildSessionFactory();
	Session s1 = sf.openSession();	
	
	Person p1 = new Person();
	p1.setFirstName("Raman");
	p1.setLastName("Shukla");
	
	Person p2 = new Person();
	p2.setFirstName("Aman");
	p2.setLastName("Verma");
	
	Person p3 = new Person();
	p3.setFirstName("Ramesh");
	p3.setLastName("Sharma");
	
	Book b1 = new Book();
	b1.setTitle("Java");
	b1.setAuthor("BS Yadav");
	b1.setPages(130);
	
	Book b2 = new Book();
	b2.setTitle("DotNet");
	b2.setAuthor("Aman Yadav");
	b2.setPages(120);
	
	Book b3 = new Book();
	b3.setTitle("Oracle");
	b3.setAuthor("Gagan Narang");
	b3.setPages(100);
	
	s1.beginTransaction();
	s1.save(p1);
	s1.save(b1);
	s1.save(p2);
	s1.save(b2);
	s1.save(p3);
	s1.save(b3);
	s1.getTransaction().commit();
	s1.flush();
	s1.close();
	System.out.println("done");
	
}
}
