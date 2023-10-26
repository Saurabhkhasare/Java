package com.app.core;

import java.time.LocalDate;
import java.util.Map;

public class Employee {

	private static int idGenerator =1;
    protected int empID;
	protected String name;
	protected LocalDate DateofJoining;
	protected String PhoneNumber;
	protected String AdharCard;
	private Double salary;
	
	



	public Employee(String name, LocalDate dateofJoining, String phoneNumber, String adharCard) {
		super();
		this.empID=idGenerator++;
		this.name = name;
		DateofJoining = dateofJoining;
		PhoneNumber = phoneNumber;
		AdharCard = adharCard;
		salary=salary;
	}



	public int getEmpID() {
		return empID;
	}

	public void setEmpID(int empID) {
		this.empID = empID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LocalDate getDateofJoining() {
		return DateofJoining;
	}

	public void setDateofJoining(LocalDate dateofJoining) {
		DateofJoining = dateofJoining;
	}

	public String getPhoneNumber() {
		return PhoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		PhoneNumber = phoneNumber;
	}

	public String getAdharCard() {
		return AdharCard;
	}

	public void setAdharCard(String adharCard) {
		AdharCard = adharCard;
	}



	@Override
	public String toString() {
		return "Employee [empID=" + empID + ", name=" + name + ", DateofJoining=" + DateofJoining + ", PhoneNumber="
				+ PhoneNumber + ", AdharCard=" + AdharCard + ", salary=" + salary + "]";
	}

	
	
	
	

}
