package com.Rajat;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Util 
{
	private static SessionFactory sf;
	static
	{
		Configuration con = new Configuration();
		con.configure();
		sf = con.buildSessionFactory();
	}
	public static Session getSession() 
	{
		return sf.openSession();	
	}
}
