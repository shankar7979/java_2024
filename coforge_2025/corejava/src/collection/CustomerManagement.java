package collection;

import java.util.HashMap;
import java.util.Map;

public class CustomerManagement {
	Map<Integer, Customer> customerMap;

	public CustomerManagement() {
		customerMap = new HashMap<Integer, Customer>();
	}

	public Customer addCustomer(Customer c) {
		customerMap.put(c.getCustomerId(), c);
		return c;
	}

	public Map<Integer, Customer> getAllCustomer() {
		return customerMap;
	}

	public Customer searchCustomer(int key) {
		if (customerMap.containsKey(key))
			return customerMap.get(key);
		else
			return null;
	}
}
/*
  while()
   1. add Customer
   2. search Customer
   3. show all customer
   }
   System.out.println("Continue y\\n");
   
 */ 
