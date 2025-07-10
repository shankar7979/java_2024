
public class StringPrg2 {

	public static void main(String[] args) {
		String s1 = "hello";
		System.out.println(s1);
		s1.concat("world");
		System.out.println(s1);

		System.out.println(s1.length());
		s1.charAt(0); // charAt returns the given char from the position
		char[] charArray = s1.toCharArray();
	}
}

/*
 * Create a class StringPalindrome with method boolean checkPalindrome(String)
 * 
 * Create a class StringReverse with method String reverse(String) using
 * toCharArray()
 */

class StringPalindrome {
	boolean checkPalindrome(String a) {
		return false;
	}
}