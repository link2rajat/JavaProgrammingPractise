package com.Rajat;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Manager 
{
public static void main(String[] args) 
{
Session s1 = Util.getSession();

Person p1 = new Person();
p1.setId(101);
p1.setFirstname("raja");
p1.setLastname("m");
p1.setAge(22);

Person p2 = new Person();
p2.setId(102);
p2.setFirstname("sanjay");
p2.setLastname("rad");
p2.setAge(25);

Person p3 = new Person();
p3.setId(103);
p3.setFirstname("krishna");
p3.setLastname("kireeti");
p3.setAge(27);

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

