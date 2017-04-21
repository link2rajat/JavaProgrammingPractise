package com.Rajat;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Manager 
{
public static void main(String[] args)
{
	Configuration con = new Configuration();
	con.configure();
	SessionFactory sf = con.buildSessionFactory();
	Session s1 = sf.openSession();
	Address a1 = new Address();
	a1.setHouseNo("123-A");
	a1.setStreetName("BTM");
	Person p1 = new Person();
	p1.setId(101);
	p1.setFirstName("Raman");
	p1.setLastName("Shukla");
	p1.setAge(22);
	p1.setAddress(a1);
	s1.beginTransaction();
	s1.save(p1);
	s1.getTransaction().commit();
	s1.flush();
	s1.close();
	System.out.println("done");

}
}
