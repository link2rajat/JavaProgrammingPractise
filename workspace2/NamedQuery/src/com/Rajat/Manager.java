package com.Rajat;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Manager 
{
public static void main(String[] args) 
{Configuration cfg = new Configuration();
cfg.configure();
SessionFactory sf = cfg.buildSessionFactory();
Session s1 = sf.openSession();
Query q1 = s1.getNamedQuery("sql");
List<Object[]>list =q1.list();
for (Object[] obj : list)
{
System.out.println(obj[0]+"\t");
System.out.println(obj[1]+"\t");
System.out.println(obj[2]+"\t");
}
s1.flush();
s1.close();
System.out.println("done");
}
}

