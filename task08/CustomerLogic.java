package by.htp.classAndObj.task08;

import java.util.Collections;
import java.util.List;

public class CustomerLogic {

	public void customerListInAlphabeticalOrder(List<Customer> customers) {
		Collections.sort(customers, new NameCustomersComparator());
	
	}
}
