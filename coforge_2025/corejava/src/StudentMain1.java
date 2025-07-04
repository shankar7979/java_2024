
public class StudentMain1 {

	public static void main(String[] args) {
		
		Student1 student1=new Student1(10001, "ram kumar", "aagra","amity");
		
		// above  one reference student1 one object 
		
		Student1 student2=student1;
		
		//above  two  reference student1, student2  both refers the same  object 
		
		System.out.println("student1 ");
		System.out.println(student1.getStudentId()+","+ student1.getStudentName()+","+ student1.getStudentAddress()+","+student1.getCollegeName());
		
		System.out.println("student2 ");
		System.out.println(student2.getStudentId()+","+ student2.getStudentName()+","+ student2.getStudentAddress()+","+student2.getCollegeName());
		
		
		student2=new Student1(10002, "shyam kumar", "new delhi","kite");
		//above  two  reference student1, student2  both refers different  object 
		
		System.out.println("student2 ");
		System.out.println(student2.getStudentId()+","+ student2.getStudentName()+","+ student2.getStudentAddress()+","+student2.getCollegeName());
		
		
	}
}
