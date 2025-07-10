
public class StringPrg1 {

	public static void main(String[] args) {
		
		
		String s1="hello";          // object is created in string pool 
		String s2="hello";  
		                      // both s1 and s2 refers same object in spring pool 
		                      // 2 reference and 1 object 
		
		System.out.println(s1==s2);   // == checks references 
		
		                              // equals -- checks the contents 
		System.out.println(s1.equals(s2));
		
		String s3=new String("hello");   // it will create a new object outside the string pool
		                         
		//3 reference and 2 object 
		
		System.out.println(s1==s3);  
		System.out.println(s1.equals(s3));  
	}
}
