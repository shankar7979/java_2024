
public class EmployeeMain {

	public static void main(String[] args) {
		
		Employee employee=new Employee();
		//employee.employeeId=989889;

		employee.setEmployeeId(677676);
		employee.setEmployeeName("suraj kumar");
		employee.setEmployeeSalary(200000);
		
		System.out.println("employee details ");
		System.out.println("\t id :"+employee.getEmployeeId());
		System.out.println("\t name :"+employee.getEmployeeName());
		System.out.println("\t salary :"+employee.getEmployeeSalary());
	
	}
}
