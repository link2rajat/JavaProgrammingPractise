package com.Rajat;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Manager3 
{
public static void main(String[] args) 
{
	Configuration config = new Configuration();
	config.configure();
	SessionFactory sf = config.buildSessionFactory();
	Session s1 = sf.openSession();
	List<Student> list = s1.createCriteria(Student.class).list();
	for (Student st1 : list) 
	{
	System.out.println(st1.getId());
	System.out.println(st1.getStudentName());
	System.out.println(st1.getQualification());
	System.out.println(st1.getAge());
	System.out.println("======================");
	}
}
}
