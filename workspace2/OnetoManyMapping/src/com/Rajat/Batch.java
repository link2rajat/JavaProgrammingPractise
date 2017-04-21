package com.Rajat;

import java.util.HashSet;
import java.util.Set;

public class Batch 
{
	private String batchID;
	private String duration;
	private int fee;
	private Set <Student> students = new HashSet <Student>();


	public String getBatchID() {
		return batchID;
	}
	public void setBatchID(String batchID) {
		this.batchID = batchID;
	}
	public String getDuration() {
		return duration;
	}
	public void setDuration(String duration) {
		this.duration = duration;
	}
	public int getFee() {
		return fee;
	}
	public void setFee(int fee) {
		this.fee = fee;
	}
	public Set<Student> getStudents() {
		return students;
	}
	public void setStudents(Set<Student> students) {
		this.students = students;
	}
	public void addStudent(Student std) 
	{
		students.add(std);	
	}
}
