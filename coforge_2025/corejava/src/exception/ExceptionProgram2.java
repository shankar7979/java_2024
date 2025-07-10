package exception;

public class ExceptionProgram2 {

	public static void main(String[] args) {

		System.out.println("program start ");

		int ar[] = { 11, 22, 3, 4, 5, 6 };
		try {
			System.out.println(ar[6]);
		} 
		catch (ArrayIndexOutOfBoundsException e) {
			System.err.println("array index error ");
		} 
		catch (Exception e) {
			System.err.println(e);
			System.err.println(e.getMessage());
		}

		System.out.println("program ends ");
	}
}
