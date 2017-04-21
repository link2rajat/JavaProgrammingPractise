package com.Rajat.client;

import java.sql.Connection;

import javax.servlet.http.HttpServletRequest;

import com.Rajat.model.Action;
import com.Rajat.model.Bean;

public class LoginAction extends Action
{

public String process(HttpServletRequest request, Bean bean) 
{
Connection con = (Connection)request.getAttribute("con");
LoginBean loginBean = (LoginBean)bean;
boolean status = LoginDAO.authentication(con,loginBean);
if(status)
	return "success";
	request.setAttribute("status", "Wrong username or password !!!");
	return "failure";
}
}
