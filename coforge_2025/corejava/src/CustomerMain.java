
public class CustomerMain {

	public static void main(String[] args) {
		
		Customer customer[]=new Customer[4]; // create array
		
		customer[0]=new Customer();// create object of array element 
		customer[1]=new Customer();
		customer[2]=new Customer();
		customer[3]=new Customer();
	
		java.util.Scanner sc=new java.util.Scanner(System.in);
	
		for(Customer c:customer) {
			System.out.println("enter id name and salary");
			c.customerId=sc.nextInt();
			sc.nextLine();
			c.customerName=sc.nextLine();
			c.customerSalary=sc.nextFloat();
		}
		
		System.out.println("customer data");
		for(Customer c:customer) {
		    c.customerInfo();
		}
		
		
	
	
	}
}
