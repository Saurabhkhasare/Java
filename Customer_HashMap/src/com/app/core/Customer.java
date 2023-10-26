package com.app.core;

import java.time.LocalDate;
import java.util.Comparator;

public class Customer {
	private static int idGenerator = 1;
	private int id;
	private String first_name;
	private String last_name;
	private String email;
	private String password;
	private double registrationAmount;
	private LocalDate dob;
	private   ServicePlan plan;
	private LocalDate regdate;
	
	public Customer( String first_name, String last_name, String email,String password, double registrationAmount, LocalDate dob,
			ServicePlan plan,LocalDate regdate) {
		super();
		this.id = idGenerator++;
		this.first_name = first_name;
		this.last_name = last_name;
		this.email = email;
		this.password=password;
		this.registrationAmount = registrationAmount;
		this.dob = dob;
		this.plan = plan;
		this.regdate=regdate;
	}
//this customer constructor email came from checkfordup method without defining it get error of undefined constructor
//	public Customer(String email) {
//		super();
//		this.email=email;
//	}


	


	public LocalDate getRegdate() {
		return regdate;
	}


	public void setRegdate(LocalDate regdate) {
		this.regdate = regdate;
	}


	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getPassword() {
		return password;
	}
	
	public void setpassword(String password) {
		this.password = password;
	}
	
	//euals/ hashcode  : not to override hashmap String :key,it has already
//	@Override
//	public boolean equals(Object o) {
//		if(o instanceof Customer) {
//			Customer c=(Customer)o;
//		return this.email.equals(c.email);
//		}
//		return false;
//	}



	@Override
	public String toString() {
		return "Employee [id=" + id + ", first_name=" + first_name + ", last_name=" + last_name + ", email=" + email
				+ ", registrationAmount=" + registrationAmount + ", dob=" + dob + ", plan=" + plan + "]";
	}
	
//	public int compareTo(Customer c)
//	{
//		return this.plan.compareTo(c.plan);
//	}
	public String getFirst_name() {
		return first_name;
	}
	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}
	
	

}
