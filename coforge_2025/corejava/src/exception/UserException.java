package exception;

class UserException extends Exception {
	public UserException(String s) {
		super(s);
	}
}

class UserMain {
	public static void main(String[] args) {

		User user = new User();
		try {
//			user.setId(0);
			user.setId(878787);
//			user.setName("");
//			user.setName("ram");
			user.setName("ram kumar");
//			user.setSalary(0);
//			user.setSalary(1000);
			user.setSalary(10000);
			
	System.out.println("User data ");
			System.err.println(user);
		} catch (UserException e) {
			System.err.println(e.getMessage());
		}
	}
}