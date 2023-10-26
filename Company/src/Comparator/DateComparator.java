package Comparator;

import java.util.Comparator;

import com.app.core.Employee;

public class DateComparator implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		
		return o2.getDateofJoining().compareTo(o1.getDateofJoining());
	}

}
