package com.Rajat;

public class Employee 
{
private EmployeePK empPK;
private String lastName;
private int age;
private double weight;
public EmployeePK getEmpPK() {
	return empPK;
}
public void setEmpPK(EmployeePK empPK) {
	this.empPK = empPK;
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
public double getWeight() {
	return weight;
}
public void setWeight(double weight) {
	this.weight = weight;
}

}
