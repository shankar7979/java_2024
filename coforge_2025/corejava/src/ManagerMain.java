
public class ManagerMain {

	public static void main(String[] args) {
		
		Person1 person1=new Manager(10001, "anil kumar", 78000, "noida", 35);
		
		person1.personInfo(); // it will call overridden method personInfo in Manager class
		
		Person1 person2=new Person1(10002, "sumit kumar", 56000 );
		
		person2.personInfo(); // it will call  method personInfo in Person class
		
	}
}
