
public class StudentMain {

	public static void main(String[] args) {
		
		Student student1=new Student();
		  // initialize all attributes with zero and null values
		System.out.println("student1\n roll "+student1.roll);
		System.out.println(" name "+student1.name);
		System.out.println(" subject "+student1.subject);
		student1.exam();
			
		// student1 is reference variable 
		// new Student()  creates object in heap and returns reference of 
		//object to  student1 reference variable 
		
		Student student2=new Student(); 
		// create another copy of all attributes and methods
		student2.roll=989898;
		student2.name="akash verma";
		student2.subject="computer science";
	
		System.out.println("student2\n roll "+student2.roll);
		System.out.println(" name "+student2.name);
		System.out.println(" subject "+student2.subject);
		student2.exam();
	}

}
