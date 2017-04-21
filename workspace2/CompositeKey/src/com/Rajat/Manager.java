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
	
	EmployeePK ep = new EmployeePK();
	ep.setFirstName("Raman");
	ep.setEmail("raman@gmail.com");
	
	Employee e = new Employee();
	e.setLastName("Gupta");
	e.setWeight(54);
	e.setEmpPK(ep);
	
	s1.beginTransaction();
	s1.save(e);
	s1.getTransaction().commit();
	s1.flush();
	s1.close();
	System.out.println("done");
	
	
}
}
