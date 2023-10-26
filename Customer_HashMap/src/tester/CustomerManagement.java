package tester;

import static utils.CustomerUtil.populatecustomer;


import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.TreeMap;

import com.app.core.Customer;

import custom_ordering.CustomerNameComparator;
import utils.CustomerValidationRule;

public class CustomerManagement {

	public static void main(String[] args) {

		try (Scanner sc = new Scanner(System.in)) {

			// at exam start with populated sample data.... for checking...
			Map<String, Customer> cust = populatecustomer();

			boolean exit = false;
			while (!exit) {
				System.out.println("1. Sign up (customer registration)\r\n" + "2. Sign in (login)\n"
						+ "3. Change password\n" + "4. Un subscribe customer\n" + "5. Display all customers\n"
						+ "6.  sorting with service plan (natural sorting)\n"
						+ "7. sorting with firstname (custom sorting)\n" 
						+"8. your pending plan from last 3 months "
						+ "0. Exit");
				System.out.println("Enter the Choice :");
				try {
					switch (sc.nextInt()) {
					case 1:

						System.out.println(
								"Enter details for Sign up: first_name, last_name, email, password, registrationAmount, dob2 (yyyy-MM-dd), plan");
						String firstName = sc.next();
						String lastName = sc.next();
						String email = sc.next();
						String password = sc.next();
						double registrationAmount = sc.nextDouble();
						String dob = sc.next();
						String date1 = sc.next();
						String plan = sc.next();
						
						Customer customer1 = CustomerValidationRule.validateAllInputs(firstName, lastName, email,
								password, registrationAmount, dob, plan, cust,date1);
					
						cust.put(customer1.getEmail(), customer1);

						break;

					case 2:
						System.out.println("Enter email and password :");
						customer1 = CustomerValidationRule.validateEmail(sc.next(), sc.next(), cust);

						System.out.println("Login successful , your details " + customer1);

						break;

					case 3:

						System.out.println("Enter email");
						String mail = sc.next();
						System.out.println("Enter password");
						String pass = sc.next();

						if (cust.containsKey(mail)) {
							System.out.println("Enter new password");
							String newPass = sc.next();
							cust.get(mail).setpassword(newPass);
							System.out.println("Password reset successfully!");
						} else {
							System.out.println("Email not found. Password reset failed.");
						}

						break;
					case 4:
						System.out.println("Enter the mail");
						
						String mail1 = sc.next();
						if (cust.containsKey(mail1)) {
							cust.remove(mail1);
							System.out.println("removed");
						}

						break;

					case 5:
						System.out.println("Customer details:");
						for (Customer customer2 : cust.values()) {

							System.out.println(customer2);

						}

						break;

					case 6:
						// sorted with ntural ordering
						TreeMap<String, Customer> cust1 = new TreeMap<>(cust);
//						cust= new TreeMap<>(cust);
						for (Customer c1 : cust1.values()) {
							System.out.println(c1);

						}

						break;
						
					case 7:
					//converted into list first
						 List<Customer> customerList = new ArrayList<>(populatecustomer().values());
						 //use sort method of list
						 Collections.sort(customerList, new CustomerNameComparator());
						 //for printing use foreach
						 for (Customer customer : customerList) {
							 System.out.println(customer);
							
						}

					break;
						 
					case 8:
						
						//List<String,Customer> list1 = populatecustomer().entrySet();
						LocalDate currentDate = LocalDate.now();
						for (Customer entry : cust.values()) {
							
							Period p = Period.between(entry.getRegdate(), currentDate);
							if(p.toTotalMonths()>3) {
								System.out.println(entry.getFirst_name()+" pending since "+p.toTotalMonths());
								System.out.println(entry);
							}
					
				
						}					
					   
						break;
						
					case 9:
						
						LocalDate cureentdate = LocalDate.now();
						
						
						for (Customer c: cust.values()) {
							
								Period p = Period.between(c.getRegdate(), cureentdate);
								
								if(p.toTotalMonths() >6) {
									
									
//										System.out.println(c.getFirst_name()+" pending since "+p.toTotalMonths());
										//cust.remove(cust);
										
										
									}
									
								}
						
							
							
						
					break;
					
					case 0:
						exit=true;

					}
				}
				catch (Exception e) {
					//System.out.println(e);
					e.printStackTrace();
					sc.nextLine();
				}

			}

		}

	}
	

}
