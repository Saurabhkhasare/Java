package utils;

import static java.time.LocalDate.parse;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.app.core.Customer;
import com.app.core.ServicePlan;

public class CustomerUtil  {

	public static Map<String, Customer> populatecustomer() {

		Map<String, Customer> custlist = new HashMap<String, Customer>();

	
		custlist.put("saurabh@gmail.com", new Customer("Saurabh222", "khasare", "saurabh@gmail.com", "123", 5000,
				parse("1998-01-02"), ServicePlan.DIAMOND,parse("2023-09-01")));

		custlist.put("abhu@gmail.com", new Customer("Abhi", "khasare", "abhu@gmail.com", "120", 10000,
				parse("1999-08-09"), ServicePlan.PLATINUM,parse("2023-06-05")));

		custlist.put("khasare@gmail.com ", new Customer("Khasare111", "saurabh", "khasare@gmail.com", "111", 2000,
				parse("1997-04-07"), ServicePlan.GOLD,parse("2023-01-11")));
		custlist.put("abhishek@gmail.com", (new Customer("Abhishek", "khasare777", "abhishek@gmail.com", "103", 10000,
				parse("1996-01-02"), ServicePlan.PLATINUM,parse("2023-08-09"))));
		custlist.put("abhi@gmail.com", new Customer("Khasare", "Abhishek", "abhi@gmail.com", "133", 1000,
				parse("1995-01-01"), ServicePlan.SILVER,parse("2023-01-21")));
		custlist.put("saurabh@gmail.com ", new Customer("Saurabh", "khasare222", "saurabh@gmail.com", "123", 5000,
				parse("1997-01-02"), ServicePlan.DIAMOND,parse("2023-07-13")));
		
		
		

		return custlist;
	}

}
