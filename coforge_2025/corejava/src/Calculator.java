public class Calculator {

	 static int addition(int a, int b) {
		 return a+b;
	 }  
	 static int subtraction(int a, int b) {
		 return a-b;
	 }  
	 static int multiplication(int a, int b) {
		 return a*b;
	 }  
	 static int division(int a, int b) {
		 return a/b;
	 }  
	 static int modulus(int a, int b) {
		 return a%b;
	 }  
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	
	public static void main(String[] args) {
		int x=10;
		int y=20;
		
		int result=addition(x, y);
		System.out.printf("first no is %d\nsecond no is %d",x,y);
		System.out.println("\nAddition is "+result);
		
	}
}
