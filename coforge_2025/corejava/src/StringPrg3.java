
public class StringPrg3 {
	public static void main(String[] args) {

		String email = "coforge_ramkumar@gmail.com";
		if (email.endsWith(".com")) {
			System.out.println("valid mail ends with .com");
		} else {
			System.out.println("invalid mail not ends with .com");
		}

		if (email.startsWith("coforge")) {
			System.out.println("valid mail starts with coforge");
		} else
			System.out.println("invalid mail not starts with coforge");

		int indexOf = email.indexOf("@");
		if (indexOf >= 0)
			System.out.println("valid mail have @ sign ");
		else
			System.out.println("invalid mail donot have @ sign ");

	}
}
