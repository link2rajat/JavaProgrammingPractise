package com.Rajat;



public class Student 
{
	private String studentID;
	private String firstName;
	private String lastName;
	private int age;
	private Batch batches;
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
	public Batch getBatches() {
		return batches;
	}
	public void setBatches(Batch batches) {
		this.batches = batches;
	}
	

}
