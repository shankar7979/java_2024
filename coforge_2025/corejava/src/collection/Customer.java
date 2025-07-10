package collection;

public class Customer {

	private int customerId;
	private String customerName;
	private  float customerSalary;
	
	public Customer(int customerId, String customerName, float customerSalary) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		this.customerSalary = customerSalary;
	}
	
	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", customerName=" + customerName + ", customerSalary="
				+ customerSalary + "]";
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public void setCustomerSalary(float customerSalary) {
		this.customerSalary = customerSalary;
	}
	public int getCustomerId() {
		return customerId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public float getCustomerSalary() {
		return customerSalary;
	}
	
	
}
