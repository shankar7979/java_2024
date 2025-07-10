package corejava;

public class Casting {

	public static void main(String[] args) {
		int x=100;
		float p=x;   // implicit casting -- widening
		
		
		double salary=20000.66556; 
		
		int sal1=(int)salary;  // explicit casting -- narrowing
		
		System.out.println(sal1);
		
		int r=767666;
		
		byte b1=(byte)r;  // explicit casting higher range to lower range 
		                   // byte -128  to 127 
		
		System.out.println(b1);
		
		System.out.println(Byte.MAX_VALUE);
		System.out.println(Byte.MIN_VALUE);
		
		
	}
}
