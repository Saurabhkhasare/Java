package utils;

import static utils.CustomerUtil.populatecustomer;

import java.time.LocalDate;

import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

import com.app.core.Customer;
import com.app.core.ServicePlan;

import custome_exception.CustomerException;

public class CustomerValidationRule {
	// create a method for no dup customers
	public static void checkForDups(String email, Map<String, Customer> customer) throws CustomerException {

		if (customer.containsKey(email)) {

			throw new CustomerException("Customer duplicate mail....");
		} else {
			System.out.println("no duplicate");
		}

	}

	// create a method for Validate plan
	public static ServicePlan validateplan(String plan) throws IllegalArgumentException {
		return ServicePlan.valueOf(plan.toUpperCase());
	}

	// create a method for checking amount match with registration amount
	public static void checkRegistrationAmount(ServicePlan plan, double amount) throws CustomerException {
		if (amount != plan.getRegistrationAmount()) {
			throw new CustomerException("Registration amount doesn't match the selected plan.");
		}

	}

	public static LocalDate parseDob(String date) throws DateTimeParseException {
		return LocalDate.parse(date);
	}
	
	public static LocalDate parseRegdate(String date) throws DateTimeParseException{
		return LocalDate.parse(date);
	}

	//for signin
	public static Customer validateEmail(String email, String password, Map<String, Customer> cust)
			throws CustomerException {
		
		Customer customer = cust.get(email);
		if (customer == null)
			throw new CustomerException("Invalid Email !!!");
		// => email ok --chk pwd
		if (!customer.getPassword().equals(password))
			throw new CustomerException("Invalid Password!!!");
		return customer;

	}



	

	public static Customer validateAllInputs(String first_name, String last_name, String email, String password,
			double registrationAmount, String dob, String plan, Map<String, Customer> cust,String regdate)
			throws CustomerException, IllegalArgumentException, DateTimeParseException {
		checkForDups(email, cust);
		ServicePlan selectedPlan = validateplan(plan);
		checkRegistrationAmount(selectedPlan, registrationAmount);
		LocalDate dob1 = parseDob(dob);
		LocalDate date1 = parseRegdate(regdate);

		return new Customer(first_name, last_name, email, password, registrationAmount, dob1, selectedPlan, date1);

	}



}
