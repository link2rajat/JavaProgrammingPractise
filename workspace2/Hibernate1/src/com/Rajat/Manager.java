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
Person p2 = new Person();
Person p3 = new Person();

p1.setId(101);
p1.setFirstname("abc");
p1.setLastname("xyz");
p1.setAge(22);

p2.setId(102);
p2.setFirstname("cdf");
p2.setLastname("dhg");
p2.setAge(24);

p3.setId(103);
p3.setFirstname("dfg");
p3.setLastname("vcb");
p3.setAge(22);


s1.beginTransaction();
s1.save(p1);
s1.save(p2);
s1.save(p3);
s1.getTransaction().commit();
s1.flush();
s1.close();
System.out.println("done");
}
}

