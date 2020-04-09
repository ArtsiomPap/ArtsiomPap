package by.htp.classAndObj.task08;

import java.util.ArrayList;
import java.util.List;

public class Customers {

	private List<Customer> customers;

	public Customers() {
		customers = new ArrayList<Customer>();
	}

	public void add(Customer c) {
		customers.add(c);

	}

	public List<Customer> getCustomers() {
		return customers;
	}	

	public void setCustomers(List<Customer> customers) {
		this.customers = customers;
	}

	@Override
	public String toString() {
		return "Customers [customers=" + customers + "]";
	}

}
