package custom_ordering;

import java.util.Comparator;

import com.app.core.Customer;

public class CustomerNameComparator implements Comparator<Customer>{

	@Override
	public int compare(Customer o1, Customer o2) {
		
		if ((o1.getFirst_name() + o1.getEmail()).compareTo(o2.getFirst_name() + o2.getEmail()) >0) {
		    return -1;
		} else if ((o1.getFirst_name() + o1.getEmail()).compareTo(o2.getFirst_name() + o2.getEmail()) < 0) {
		    return 1;
		} else {
		    return 0;
		}

}

}
