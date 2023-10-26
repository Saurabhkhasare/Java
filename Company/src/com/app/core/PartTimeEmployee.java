package com.app.core;

import java.time.LocalDate;

public class PartTimeEmployee extends Employee {

	private double HourlySalary;

	public PartTimeEmployee(String name, LocalDate dateofJoining, String phoneNumber, String adharCard,
			double hourlySalary) {
		super(name, dateofJoining, phoneNumber, adharCard);
		HourlySalary = hourlySalary;
	}

	public double getHourlySalary() {
		return HourlySalary;
	}

	public void setHourlySalary(double hourlySalary) {
		HourlySalary = hourlySalary;
	}

	
	
//	@Override
//	public String toString() {
//		return "Employee [empID=" + empID + ", name=" + name + ", DateofJoining=" + DateofJoining + ", PhoneNumber=" + PhoneNumber
//				+ ", AdharCard=" + AdharCard +", HourlySalary= " + HourlySalary + "]";
//	}

}
