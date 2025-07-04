
public class User {

	int userId;
	String name;  // instance variable  can use any access modifier , final, static 
	
	public static void main(String[] args) {
		
		//private 
		int y;  // local variable  no modifier except final is allowed 
		
		        // local variable has no default value  must initialize before use 
		
		User user=new User();
		
		System.out.println(user.userId);
		System.out.println(user.name);
		y=9898;
		
		System.out.println(y);
		
		final String p="";
		
	}
//	void show(private String s) {
//		
//	}
	
}
