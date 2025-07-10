package collection;

import java.util.Map.Entry;
import java.util.Scanner;

public class CustomerMain {

	public static void main(String[] args) {
		String ch="y";
		CustomerManagement customerManagement=new CustomerManagement();
		Scanner scanner=new Scanner(System.in);
		
		while(ch.equals("y")) {
			System.out.println("1. add customer");
			System.out.println("2. search customer");
			System.out.println("3.  show all customer");
			int op=scanner.nextInt();
			switch (op) {
			case 1: {
				System.out.println("Enter id, name, salary");
				  Customer customer=new Customer(scanner.nextInt(), scanner.next(), scanner.nextFloat());
			     System.out.println("added "+ customerManagement.addCustomer(customer));
			     break;
			}
			case 2: {
				System.out.println("Enter id");
				 Customer  c=customerManagement.searchCustomer(scanner.nextInt());
				 if(c!=null) {
					 System.out.println("found "+c);
				 }
				 else 
					 System.out.println("not found");
				 break;
			}
			case 3: {
				for(Entry<Integer, Customer> c:customerManagement.getAllCustomer().entrySet())
	                   System.out.println(c);		
				break;
			}
			
			default:
				System.out.println("Wrong operation");
				break;
			}
			System.out.println("continue y\\n");
			ch=scanner.next();
		}
		
		
	}
}
