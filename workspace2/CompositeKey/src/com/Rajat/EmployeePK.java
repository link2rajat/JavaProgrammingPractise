package com.Rajat;

import java.io.Serializable;

public class EmployeePK implements Serializable
{
private String firstName;
private String email;
public String getFirstName() 
{
	return firstName;
}
public void setFirstName(String firstName) 
{
	this.firstName = firstName;
}
public String getEmail() 
{
	return email;
}
public void setEmail(String email) 
{
	this.email = email;
}

}
