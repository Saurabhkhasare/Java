package Tester;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import com.app.core.Employee;
import com.app.core.FullTimeEmployee;
import com.app.core.PartTimeEmployee;

import Comparator.DateComparator;
import utils.ValidationRules;

public class Tester {

	public static void main(String[] args) {
		
		
		
		try(Scanner sc = new Scanner(System.in)){
			Map<Integer, Employee> maplist = new HashMap<>();
			boolean exit = false;
			
			while(!exit)
				
			{
				System.out.println("1. Add full time employee\r\n"
						+ "2. Add part time employee\r\n"
						+ "3. Delete an employee by Emp Id\r\n"
						+ "4. Search employee details by Aadhaar number\r\n"
						+ "5. Display all employee details\r\n"
						+ "6. Display all employee details sorted by date of joining\r\n"
						+ "7. Exit");
				try {
					switch (sc.nextInt()) {
					case 1:
						System.out.println("Details of Full Time Employee :  name,  dateofJoining,  phoneNumber, adharCard, monthlysalary");
                        FullTimeEmployee employee = ValidationRules.ValidateFullTimeEmployee(sc.next(),sc.next(),sc.next(),sc.next(),sc.nextDouble(),maplist);
						maplist.put(employee.getEmpID(), employee);
						break;
						
					case 2:
						System.out.println("Details of Full Time Employee :  name,  dateofJoining,  phoneNumber, adharCard, hourlysalary");
						PartTimeEmployee employee1 = ValidationRules.ValidatePartTimeEmployee(sc.next(),sc.next(),sc.next(),sc.next(),sc.nextDouble(),maplist);
						maplist.put(employee1.getEmpID(), employee1);
						break;
						
					case 3:
						System.out.println("Enter id to delete");
						int id = sc.nextInt();
						
						if(maplist.containsKey(id))
						{
//							System.out.println("hiii");
							maplist.remove(id);
							
						}


						break;
						
					case 4:
						System.out.println("Enter your adhar number:");
						String adhno= sc.next();
						
						
							for (Employee e : maplist.values()) {
								if(e.getAdharCard().equals(adhno))
								{
								System.out.println(e);
			
							}
								System.out.println("invalid");
						}
						break;
						
					case 5:
						for (Employee e1 : maplist.values()) {
							System.out.println(e1);
							
						}

				
						break;
					case 6:
						List<Employee> list1 = new ArrayList<>(maplist.values());
						Collections.sort(list1, new DateComparator());
						for (Employee employee2 : list1) {
							System.out.println(employee2);
							
						}
						break;
						
					}
					
				}catch (Exception e) {
					System.out.println(e);
					sc.nextLine();
				}
			}
		}

	}

}
