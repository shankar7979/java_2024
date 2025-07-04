import java.util.Scanner;

public class Student1Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int id;
		String name;
		String address;
		String collegename;
		Student1 student1;

		System.out.println("Enter Student's Id");
		id = scanner.nextInt();

		System.out.println("Enter Student's Name");
		name = scanner.next();

		System.out.println("Enter Student's address");
		address = scanner.next();
	
		while (true) {
			System.out.println("Whether students is from NIT (Yes/No)");
			String result = scanner.next();
			if (result.equals("Yes")) {
				student1 = new Student1(id, name, address);
				break;
			} else if (result.equals("No")) {
				System.out.println("Enter the college name");
				collegename = scanner.next();
				student1 = new Student1(id, name, address, collegename);
				break;
			} else {
				System.out.println("Wrong Input");
				continue;
			}
		}

		System.out.println("Student id "+student1.getStudentId());
		System.out.println("Student name "+student1.getStudentName());
		System.out.println("Address "+student1.getStudentAddress());
		System.out.println("College "+student1.getCollegeName());
	}
}
