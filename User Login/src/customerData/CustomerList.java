package customerData;

import java.util.*;

public class CustomerList {
	
	public static ArrayList<Customer> customers = new ArrayList<Customer>();
	
	public CustomerList() {
		customers.add(new Customer("234","Sam","9887766545","regular"));
		customers.add(new Customer("456","Smith","6554477890","special"));
		customers.add(new Customer("234","Will","77665544321","regular"));
		customers.add(new Customer("234","Charlie","88776699005","special"));
	}
	
	public static void addCustomer(Customer c) {
		customers.add(c);
	}
	
	public static ArrayList<Customer> getList(){
		return customers;
	}

}
