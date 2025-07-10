public class Overloading {
     // compile time polymorphism
	static int addition(int a, int b) {
		return a+b;
	}
	
	static int addition(int a, int b, int c) {
		return a+b+c;
	}
	
	static float addition(float a, float b) {
		return a+b;
	}
	
	static String addition(String a, String b) {
		return a+"  "+b;
	}
	public static void main(String[] args) {
		
		System.out.println(addition(11, 22));
		System.out.println(addition(99.667f, 445.556f));
		System.out.println(addition("suresh", "verma"));
		System.out.println(addition(1,2,3));
	}
	
}
