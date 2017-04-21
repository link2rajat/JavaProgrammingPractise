package com.Rajat.client;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.Rajat.util.DbUtil;

public class LoginDAO 
{
public static boolean authentication(Connection con,LoginBean bean)
{
	String username = bean.getUsername();
	String password = bean.getPassword();
	Statement stmt = null;
	ResultSet rs = null;
	String sqlQry = "";
	try 
	{
	stmt = con.createStatement();
	sqlQry = "Select * from Users where Username='"+username+"'and Password='"+password+"'";
    rs = stmt.executeQuery(sqlQry);
    return rs.next();
	}
	catch (SQLException e)
	{
		e.printStackTrace();
	}
	finally
	{
	DbUtil.closeResultSet(rs);
	DbUtil.closeStatement(stmt);
	}
	return false;
}
}
