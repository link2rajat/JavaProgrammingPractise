package com.Rajat;

import java.util.HashSet;
import java.util.Set;

public class Student 
{
private String studentID;
private String firstName;
private String lastName;
private int age;
private Set<Batch> batches = new HashSet<Batch>();
public String getStudentID() {
	return studentID;
}
public void setStudentID(String studentID) {
	this.studentID = studentID;
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
public Set<Batch> getBatches() {
	return batches;
}
public void setBatches(Set<Batch> batches) {
	this.batches = batches;
}

}
