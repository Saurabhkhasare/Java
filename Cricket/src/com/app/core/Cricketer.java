package com.app.core;

public class Cricketer {
	
	private String name;
	private int age;
	private String email_id;
	private int Phone;
	private int rating;
	
	public Cricketer(String name, int age, String email_id, int phone, int rating) {
		super();
		this.name = name;
		this.age = age;
		this.email_id = email_id;
		Phone = phone;
		this.rating = rating;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}





	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	@Override
	public String toString() {
		return "Cricketer [name=" + name + ", age=" + age + ", email_id=" + email_id + ", Phone=" + Phone + ", rating="
				+ rating + "]";
	}
	
	
	

}
