package collection;

import java.util.List;

public class UserMain {

	public static void main(String[] args) {

		User user[] = new User[4];// create array

		int id[] = { 767676, 565567, 55656, 766776 };
		String nm[] = { "amitesh kumar", "vineet kumar", "suman kumar", "bablu singh" };

		float sal[] = { 34000, 56000, 12000, 67000 };

		UserOperaion operation = new UserOperaion();

		for (int i = 0; i < sal.length; i++) {
			user[i] = new User(id[i], nm[i], sal[i]); // each object creation
			operation.addUser(user[i]);
		}

		List<User> allUser = operation.getAllUser();

		System.out.println(allUser);
		for (User user2 : allUser) {
			System.out.println(user2);
		}

		System.out.println(operation.searchUser(user[0]));

		System.out.println(operation.searchUser(new User(88, "shyam", 56000)));

		try {
			System.out.println("removed user is " + operation.removeUser(0));
			System.out.println(operation.searchUser(user[0]));

//			System.out.println("removed user is " + operation.removeUser(11));
			
			System.out.println("removed user is " + operation.removeUser(user[0]));
			
		} catch (UserException e) {
			System.err.println(e.getMessage());
		}
	}
}
