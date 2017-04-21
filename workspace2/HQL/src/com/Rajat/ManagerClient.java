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
Session se1 = sf.openSession();

Student s1 = new Student();
s1.setId("101");
s1.setAge(22);
s1.setQualification("BE");
s1.setStudentName("Raman");

Student s2 = new Student();
s2.setId("102");
s2.setAge(25);
s2.setQualification("ME");
s2.setStudentName("Aman");

se1.beginTransaction();
se1.save(s1);
se1.save(s2);
se1.getTransaction().commit();
se1.flush();
se1.close();
System.out.println("done");
}
}

