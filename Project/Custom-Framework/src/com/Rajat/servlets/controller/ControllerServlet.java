package com.Rajat.servlets.controller;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.sql.Connection;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.Rajat.db.pool.ConnectionPool;
import com.Rajat.model.Action;
import com.Rajat.model.Bean;
import com.Rajat.model.RequestInfo;
import com.Rajat.xml.ModuleConfig;

public class ControllerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       private ConnectionPool cp = null;
       private ModuleConfig moduleConfig = null;
       public ControllerServlet() 
    {
    super();
    }
    @Override
    public void init() throws ServletException 
    {
   String driverClass = getInitParameter("driverClass");
   String url = getInitParameter("url");
   String username = getInitParameter("username");
   String password = getInitParameter("password");
   String poolSize = getInitParameter("poolSize");
   int intPoolSize = Integer.parseInt(poolSize);
   cp = new ConnectionPool(driverClass, url, username, password, intPoolSize);
   cp.init();
   String fileName = getInitParameter("config-file");
   InputStream is = this.getClass().getResourceAsStream("/../"+fileName);
   try {
	moduleConfig = new ModuleConfig(is);
       } 
   catch (Exception e) 
       {
     e.printStackTrace();
        }
   
    }   
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
    {
	doPerform(request,response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		doPerform(request,response);
	}
	public void doPerform(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
	String path = request.getServletPath();
	path = path.substring(1, path.length()-3);
	Connection con = cp.checkOut();
	request.setAttribute("con", con);
	RequestInfo reqInfo = moduleConfig.getReqInfo(path);
	String beanClass = reqInfo.getBeanClass();
	Bean beanObj = getBeanObject(beanClass,request);
	String actionClass = reqInfo.getActionClass();
	Action actionObj = getActionObject(actionClass);
	String result = actionObj.process(request, beanObj);
	String resultPath = reqInfo.getForward(result);
	RequestDispatcher rd = request.getRequestDispatcher(resultPath);
	rd.forward(request, response);
	request.removeAttribute("con");
	cp.checkIn(con);
	}
	private Bean getBeanObject(String beanClass,HttpServletRequest request)
	{
	Object obj = null;
	Class cls = null;
	try 
	{
		cls = Class.forName(beanClass);
		obj = cls.newInstance();
	} 
	catch (Exception e) 
	{
	e.printStackTrace();
	}
	Field all[] = cls.getDeclaredFields();
	String methodName = null;
	Method methodObj = null;
	String fieldName;
	String fieldValue;
	for (Field f1 : all) 
	{
	fieldName = f1.getName();
	fieldValue = request.getParameter(fieldName);
	if (fieldValue != null) 
	{
	methodName = "set"+fieldName.substring(0,1).toUpperCase()+fieldName.substring(1);
	
	try 
	{
	methodObj = cls.getDeclaredMethod(methodName, f1.getType());
	if (f1.getType().equals(String.class))
	{
		methodObj.invoke(obj, fieldValue);
	}
	if (f1.getType().equals(Byte.class))
	{
		methodObj.invoke(obj, new Byte(fieldValue));
	}
	if (f1.getType().equals(Short.class))
	{
		methodObj.invoke(obj, new Short(fieldValue));
	}
	if (f1.getType().equals(Integer.class))
	{
		methodObj.invoke(obj, new Integer(fieldValue));
	}
	if (f1.getType().equals(Float.class))
	{
		methodObj.invoke(obj, new Float(fieldValue));
	}
	if (f1.getType().equals(Long.class))
	{
		methodObj.invoke(obj, new Long(fieldValue));
	}
	if (f1.getType().equals(Double.class))
	{
		methodObj.invoke(obj, new Double(fieldValue));
	}
	if (f1.getType().equals(byte.class))
	{
		methodObj.invoke(obj, Byte.parseByte(fieldValue));
	}
	if (f1.getType().equals(short.class))
	{
		methodObj.invoke(obj, Short.parseShort(fieldValue));
	}
	if (f1.getType().equals(int.class))
	{
		methodObj.invoke(obj, Integer.parseInt(fieldValue));
	}
	if (f1.getType().equals(long.class))
	{
		methodObj.invoke(obj, Long.parseLong(fieldValue));
	}
	if (f1.getType().equals(float.class))
	{
		methodObj.invoke(obj, Float.parseFloat(fieldValue));
	}
	if (f1.getType().equals(double.class))
	{
		methodObj.invoke(obj, Double.parseDouble(fieldValue));
	}
	if (f1.getType().equals(String[].class))
	{
		String x[] = request.getParameterValues(fieldName);
		methodObj.invoke(obj, new Object[]{x});
	}
   } 
	catch (Exception e) 
	{
	e.printStackTrace();
	}
	}
	
	fieldValue = null;
	}
	
	return (Bean)obj;		
	}
 private Action getActionObject(String actionClass)
 {
 Object obj = null;
 try 
  {
	obj = Class.forName(actionClass).newInstance();
  }
 catch (Exception e) 
  {
	e.printStackTrace();
  }
 return (Action)obj;
 }

public void destroy() 
{
cp.release();
}
	
}
