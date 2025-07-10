package exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ArrayException {

	Scanner scanner;

	public ArrayException() {
		scanner = new Scanner(System.in);
	}

	public String getPriceDetails() {
		System.out.println("Enter the number of elements in the array");
		int n = scanner.nextInt();

		int ar[] = new int[n];
		System.out.println("Enter the price details ");
		try {
			for (int i = 0; i < ar.length; i++) {
				ar[i] = scanner.nextInt();
			}

		} catch (InputMismatchException e) {
			return "Input was not in the correct format";
		}
		try {
			System.out.println("Enter the index of the array element you want to access");
			int index = scanner.nextInt();
			return "The array element is " + ar[index];
		} catch (ArrayIndexOutOfBoundsException e) {
			return "Array index is out of range";
		}
	}

	public static void main(String[] args) {

		System.out.println(new ArrayException().getPriceDetails());

	}
}
