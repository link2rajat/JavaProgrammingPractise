package com.Rajat;

import java.util.List;

import org.hibernate.Query;
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
	
	Query query = s1.createQuery("from com.Rajat.Student where studentName like '%am%'");
	List<Student> list = query.list();
	for (Student se1 : list) 
	{
		System.out.println(se1.getId());
		System.out.println(se1.getStudentName());
		System.out.println(se1.getQualification());
		System.out.println("================");
	}
	System.out.println("DONE");
}
}
