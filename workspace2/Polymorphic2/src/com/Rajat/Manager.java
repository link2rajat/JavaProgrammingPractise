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
Person p1 = new Person();
p1.setId("p101");
p1.setFirstName("vinod");
p1.setLastName("kumar");
p1.setAge(26);

Employee e1 = new Employee();
e1.setId("p102");
e1.setFirstName("manu");
e1.setLastName("k");
e1.setAge(22);
e1.setProjectName("ECZ");
e1.setSalary(12000);
PermanentEmployee pe = new PermanentEmployee();
pe.setId("p103");
pe.setFirstName("gokul");
pe.setLastName("krishna");
pe.setAge(23);
pe.setProjectName("WBE");
pe.setSalary(140000);
pe.setAllowance(4000.00);
pe.setLeaveCount(12);
s1.beginTransaction();
s1.save(p1);
s1.save(e1);
s1.save(pe);
s1.getTransaction().commit();
s1.flush();
s1.close();
System.out.println("done");
}
}
