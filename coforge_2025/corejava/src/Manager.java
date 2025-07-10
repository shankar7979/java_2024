public class Manager extends Person1 {

	private String city;
	private int age;

	@Override
//public
protected	
void personInfo() {
		 super.personInfo();

//		System.out.println("Manager Information");
//		System.out.println("\tId : " + getId());
//		System.out.println("\tName : " + getName());
//		System.out.println("\tSalary : " + getSalary());

		System.out.println("\tCity : " + getCity());
		System.out.println("\tAge : " + getAge());
	}

	public Manager(int id, String name, float salary, String city, int age) {
		super(id, name, salary);
		this.city = city;
		this.age = age;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

}
