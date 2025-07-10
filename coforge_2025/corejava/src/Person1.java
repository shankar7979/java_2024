public class Person1 {
	private int id;
	private String name;
	private float salary;

	//public 
	protected
	void personInfo() {
		System.out.println("Person Information");
		System.out.println("\tId : " + getId());
		System.out.println("\tName : " + getName());
		System.out.println("\tSalary : " + getSalary());
	}
	

	public Person1(int id, String name, float salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public float getSalary() {
		return salary;
	}

}
