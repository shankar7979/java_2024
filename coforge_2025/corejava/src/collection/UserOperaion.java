package collection;

import java.util.ArrayList;
import java.util.List;

public class UserOperaion {

	List<User> userList;

	public UserOperaion() {
		userList = new ArrayList<User>();
	}

	public void addUser(User u) {
		userList.add(u);
	}

	public List<User> getAllUser() {
		return userList;
	}

	public boolean searchUser(User u) {
		if (userList.contains(u))
			return true;
		return false;
	}

	public User removeUser(int index) {
		if (index < userList.size()) {
			User u = userList.get(index);
			userList.remove(index);
			return u;
		} else
			throw new UserException("index not present");
		// return null;
	}

	public User removeUser(User u) {
		if (searchUser(u)) {
			userList.remove(u);
			return u;
		}
		// return null;
		else
			throw new UserException("user not present");
	}

}

class UserException extends RuntimeException {
	public UserException(String s) {
		super(s);
	}
}