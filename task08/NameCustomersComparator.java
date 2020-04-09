package by.htp.classAndObj.task08;

import java.util.Comparator;

public class NameCustomersComparator implements Comparator<Customer> {

	@Override
	public int compare(Customer arg0, Customer arg1) {
		String c1 = arg0.getName();
		String c2 = arg1.getName();
		return c1.compareTo(c2);
	}

}
