package com.Rajat;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name ="person")

public class Person 
{
@Id
@Column (name = "p_ID")
private String personID;

@Column (name = "p_FName")
private String firstName;

@Column (name = "p_LName")
private String lastName;

@Column (name = "p_age")
private int age;

public String getPersonID() {
	return personID;
}

public void setPersonID(String personID) {
	this.personID = personID;
}

public String getFirstName() {
	return firstName;
}

public void setFirstName(String firstName) {
	this.firstName = firstName;
}

public String getLastName() {
	return lastName;
}

public void setLastName(String lastName) {
	this.lastName = lastName;
}

public int getAge() {
	return age;
}

public void setAge(int age) {
	this.age = age;
}



}
