package exception;

public class User {

	private int id;
	private String name;
	private float salary;

	public int getId() {
		return id;
	}

	public void setId(int id) throws UserException {
		if (id <= 0)
			throw new UserException("invalid id");

		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) throws UserException {
		if (name.isBlank())
			throw new UserException("name is blank ");
		else if (name.length() <= 5)
			throw new UserException("name must of more than 5 character ");
		this.name = name;
	}

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) throws UserException {
		if (salary <= 0)
			throw new UserException("invalid salary it cannot eb zero or -ve");
		else if (salary < 5000 || salary > 50000)
			throw new UserException("salary must be in the range of 5000 - 50000");
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
	
}
