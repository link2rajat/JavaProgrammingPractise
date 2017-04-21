package com.Rajat;

public class PermanentEmployee extends Employee
{
private double allowance;
private int leaveCount;
public double getAllowance() 
{
	return allowance;
}
public void setAllowance(double allowance) {
	this.allowance = allowance;
}
public int getLeaveCount() {
	return leaveCount;
}
public void setLeaveCount(int leaveCount) {
	this.leaveCount = leaveCount;
}

}
