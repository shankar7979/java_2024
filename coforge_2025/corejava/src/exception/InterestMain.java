package exception;

import java.util.Scanner;

public class InterestMain {

	public static void main(String[] args) {

		System.out.println("program starts ");

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter amount, rate and time");

		InterestCalculation calculation = new InterestCalculation(scanner.nextFloat(), scanner.nextFloat(),
				scanner.nextInt());

		System.out.println(calculation);

		float intCacl;
		try {
			intCacl = calculation.intCacl(calculation.getAmount(), calculation.getTime(), calculation.getRate());
			System.out.println("Interest is " + intCacl);

		} catch (Exception e) {
	//		System.err.println(e.getMessage());
			System.err.println("in method main error is "+e.getMessage());
		}

		scanner.close();

		System.out.println("program ends  ");
	}
}
