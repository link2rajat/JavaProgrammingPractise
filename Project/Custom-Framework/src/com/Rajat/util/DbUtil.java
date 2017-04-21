package com.Rajat.util;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DbUtil 
{
public static void closeStatement(Statement stmt)
{
try
{
if(stmt!=null)
{
stmt.close();	
stmt = null;
	
}	
}
catch (SQLException e) 
{
e.printStackTrace();
}
}
public static void closeResultSet(ResultSet rs)
{
try
{
if(rs!=null)
{
rs.close();	
rs = null;
	
}	
}
catch (SQLException e) 
{
e.printStackTrace();
}
}
}
