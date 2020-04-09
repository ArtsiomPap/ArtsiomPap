package by.htp.classAndObj.task08;

import java.util.Collections;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		Customer Vitya = new Customer(34313, "Zayats", "Vitya", "Anatolevich", "str:Ilimskaya,h0me:32,flat:54", 555,
				"abv245687");

		Customer Kolya = new Customer(34323, "Vredin", "Kolya", "Andreevich", "str:Ilimskaya,h0me:12,flat:53", 680,
				"abv245697");

		Customer Andrey = new Customer(34333, "Pipkin", "Andrey", "Sergeevich", "str:Ilimskaya,h0me:14,flat:5", 667,
				"abv245657");

		Customer Zigmunt = new Customer(34313, "Zayats", "Zigmunt", "Anatolevich", "str:Ilimskaya,h0me:32,flat:54", 900,
				"abv245617");

		Customers customers = new Customers();
		customers.add(Zigmunt);
		customers.add(Andrey);
		customers.add(Kolya);
		customers.add(Vitya);

		CustomerLogic customerLogic = new CustomerLogic();
		customerLogic.customerListInAlphabeticalOrder( customers.getCustomers());// имена по алфавиту

		customerLogic.soutName((customers.getCustomers()));
		
	//	customerLogic.soutName((customerLogic.customerNumberCardInterval(customers.getCustomers())));//имена чьи кредитки в интервале

	}
}
