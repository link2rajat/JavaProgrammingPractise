package com.Rajat;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Manager1 
{
	public static void main(String[] args) 
	{
		Configuration con = new Configuration();
		con.configure();
		SessionFactory sf = con.buildSessionFactory();
		Session se1 = sf.openSession();

		Batch b1 = new Batch();
		b1.setBatchID("b101");
		b1.setDuration("4 months");
		b1.setFee(10000);

		Batch b2 = new Batch();
		b2.setBatchID("b102");
		b2.setDuration("6 months");
		b2.setFee(12000);

		Student s1 = new Student();
		s1.setStudentID("std101");
		s1.setFirstName("Ramu");
		s1.setLastName("b");
		s1.setAge(22);
		b1.addStudent(s1);
		b2.addStudent(s1);

		Student s2 = new Student();
		s2.setStudentID("std102");
		s2.setFirstName("Kiran");
		s2.setLastName("b");
		s2.setAge(22);
		b1.addStudent(s2);

		Student s3 = new Student();
		s3.setStudentID("std103");
		s3.setFirstName("Vijay");
		s3.setLastName("b");
		s3.setAge(22);
		b2.addStudent(s3);

		Student s4 = new Student();
		s4.setStudentID("std104");
		s4.setFirstName("Pavan");
		s4.setLastName("b");
		s4.setAge(22);
		b2.addStudent(s4);

		se1.beginTransaction();
		se1.save(b1);
		se1.save(b2);
		se1.save(s1);
		se1.save(s2);
		se1.save(s3);
		se1.save(s4);
		
		se1.getTransaction().commit();
		se1.flush();
		se1.close();

		System.out.println("done");

	}
}
