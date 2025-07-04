/**
 * 
 *  customer class created by ram kumar
 * <br> it has three attributes and one method
 */

public class Customer {
  int customerId;
  String customerName;
  float customerSalary;
 
  /**
   *  customerInfo gives information about customerId, customerName, customerSalary
   * 
   */
  
  void customerInfo() {
	  System.out.println("\nCustomer Information");
	  System.out.println("\tId "+customerId);
	  System.out.println("\tName "+customerName);
	  System.out.println("\tsalary "+customerSalary);
  }
  
  
}
