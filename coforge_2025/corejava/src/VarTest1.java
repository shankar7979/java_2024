public class VarTest1 {

	static void display(int a,int b, int... c) {
		System.out.println();
		System.out.println(a);
		System.out.println(b);
		
		for(int p:c)
			System.out.print(p+",");
		
	}
	
//	public static void main(String[] args) {
		public static void main(String...args) {
		
		display(1, 2, 3);
		display(1, 2, 3,4,5,6);
		int ar[]= {11,22,33,44};
		
		display(1, 2,ar);
		
	}
}
