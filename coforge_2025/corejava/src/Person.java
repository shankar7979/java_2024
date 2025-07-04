public class Person {

	private int personId;
	private String personName;
	private float personSalary;
	private float personPf;
	
	
	public Person(int personId, String personName, float personSalary, float personPf) {
		super();
		this.personId = personId;
		this.personName = personName;
		this.personSalary = personSalary;
		this.personPf = personPf;
	}


	public float getGrosssalary() {
		return this.personSalary-(this.personSalary*this.personPf);
	}

	
	public float getPersonPf() {
		return personPf;
	}

	public int getPersonId() {
		return personId;
	}

	public String getPersonName() {
		return personName;
	}

	public float getPersonSalary() {
		return personSalary;
	}


}
