package by.htp.classAndObj.task08;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CustomerLogic {

	public void customerListInAlphabeticalOrder(List<Customer> customers) {
		Collections.sort(customers, new NameCustomersComparator());

	}

	public List<Customer> customerNumberCardInterval(List<Customer> customers) {
		List<Customer> customerNew = new ArrayList<Customer>();

		for (Customer x : customers) {
			if (x.getCreditCardNumber() > 666 & x.getCreditCardNumber() < 800) {
				customerNew.add(x);

			}
		}
	
		return customerNew;
	}
	public void soutName(List<Customer> customers) {
		for(Customer x :customers) {
		System.out.println(x.getName());
			
		}
	}

}
