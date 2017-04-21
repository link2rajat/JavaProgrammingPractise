package com.Rajat;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;

public class Manager 
{
public static void main(String[] args) 
{
AnnotationConfiguration ac = new AnnotationConfiguration();
ac.configure();

SessionFactory sf = ac.buildSessionFactory();
Session s1 = sf.openSession();

Person p1 = new Person();
p1.setPersonID("101");
p1.setFirstName("Rajat");
p1.setLastName("Rathi");
p1.setAge(22);

Transaction tn = s1.beginTransaction();
s1.save(p1);
tn.commit();
s1.flush();
s1.close();
System.out.println("done");
}
}
