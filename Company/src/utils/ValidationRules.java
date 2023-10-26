package utils;


import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.Map;

import com.app.core.Employee;
import com.app.core.FullTimeEmployee;
import com.app.core.PartTimeEmployee;

import ManageException.ManageException;

public class ValidationRules {

	public static void ValidateEmployee(String name, Map<Integer, Employee> maplist) throws ManageException {
		
		for (Employee e: maplist.values()) {
			if(e.getName().equals(name)) {
				throw new ManageException("Duplicate Entry");
			}else {
				System.out.println("Entry added..");
			}	
		}
	}
	

	public static LocalDate vallidatejod(String dateofJoining) throws DateTimeParseException {
		return LocalDate.parse(dateofJoining);
	}

	public static String validatePhoneNumber(String phonenumber, Map<Integer, Employee> maplist) throws ManageException {
		if (phonenumber.matches("^[0-9]{10}$")) {
			return phonenumber;
		} else
			throw new ManageException("Phone number is inavalid");
	}
	
	public static String ValidateAdhar(String adharcard,Map<Integer, Employee> maplist) throws ManageException
	{
		if (adharcard.matches("^[0-9]{10}$")) {
			return adharcard;
		} else
			throw new ManageException("adharcards number is inavalid");
	}
		


//	public static Employee vallidateInput(String name, String dateofJoining, String phoneNumber, String adharCard,
//			Map<String, Employee> maplist) throws ManageException {
//
//		String phoneNumber2 = validatePhoneNumber(phoneNumber, maplist);
//		ValidateEmployee(adharCard, maplist);
//		LocalDate vallidatejod = vallidatejod(dateofJoining);
//	
//	
//		
//
//		return new Employee(name, vallidatejod, phoneNumber2,adharCard);
//	}

	public static FullTimeEmployee ValidateFullTimeEmployee(String name, String dateofJoining, String phoneNumber, String adharCard,
			double salary,Map<Integer, Employee> maplist) throws ManageException {
		String phoneNumber2 = validatePhoneNumber(phoneNumber, maplist);
		ValidateEmployee(name, maplist);
		LocalDate vallidatejod = vallidatejod(dateofJoining);
		
				return new FullTimeEmployee(name, vallidatejod, phoneNumber, adharCard, salary);
		
		
	}

	public static PartTimeEmployee ValidatePartTimeEmployee(String name, String dateofJoining, String phoneNumber, String adharCard,
			double salary, Map<Integer, Employee> maplist) throws ManageException {
		String phoneNumber2 = validatePhoneNumber(phoneNumber, maplist);
		ValidateEmployee(adharCard, maplist);
		LocalDate vallidatejod = vallidatejod(dateofJoining);
		
		return new PartTimeEmployee(name, vallidatejod, phoneNumber, adharCard, salary);
	}


	

	

}
