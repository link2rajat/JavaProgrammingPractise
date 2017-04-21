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
p1.setId(101);
p1.setAge(22);
p1.setFirstName("abc");
p1.setLastName("xyz");

Address a1 = new Address();
a1.setHouseNo(123);
a1.setStreetName("BTM");
a1.setState("Kar");
a1.setPerson(p1);
p1.setAddress(a1);

Person p2 = new Person();
p2.setId(102);
p2.setAge(22);
p2.setFirstName("babu");
p2.setLastName("k");

Address a2 = new Address();
a2.setHouseNo(153);
a2.setStreetName("KRP");
a2.setState("Kar");
a2.setPerson(p2);
p2.setAddress(a2);

s1.beginTransaction();
s1.save(p1);
s1.save(p2);
s1.save(a1);
s1.save(a2);
s1.getTransaction().commit();
s1.flush();
s1.close();
System.out.println("done");
}
}
