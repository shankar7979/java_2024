package exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionProgram3 {

	public static void main(String[] args) {

		int no;
		Scanner scanner = null;

		try {
			scanner = new Scanner(System.in);
			System.out.println("Enter number");

			no = scanner.nextInt();
		}
// catch (InputMismatchException e) {
//			System.err.println("add correct format value ");
//		} catch (NullPointerException e) {
//			System.err.println("null error  ");
//		}
		catch (NullPointerException | InputMismatchException e) {
			System.err.println("eith null or input format error ");
		}

		catch (Exception e) {
			System.err.println("some error " + e);
		}

		finally {
			System.out.println("finally called ");
			scanner.close();
		}
	}

}
