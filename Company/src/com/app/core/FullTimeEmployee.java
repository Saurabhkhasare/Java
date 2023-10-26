package com.app.core;

import java.time.LocalDate;

public class FullTimeEmployee extends Employee {

	private double MonthlySalary;
	
	

	public FullTimeEmployee(String name, LocalDate dateofJoining, String phoneNumber, String adharCard,
			double monthlySalary) {
		super(name, dateofJoining, phoneNumber, adharCard);
		this.MonthlySalary = monthlySalary;
	}

	public double getMonthlySalary() {
		return MonthlySalary;
	}

	public void setMonthlySalary(double monthlySalary) {
		MonthlySalary = monthlySalary;
	}

//	@Override
//	public String toString() {
//		return "Employee [empID=" + empID + ", name=" + name + ", DateofJoining=" + DateofJoining + ", PhoneNumber=" + PhoneNumber
//				+ ", AdharCard=" + AdharCard +", MonthlySalary=" + MonthlySalary + "]";
//	}

}
