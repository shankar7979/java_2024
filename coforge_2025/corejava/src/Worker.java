public class Worker {
	private String name;
	private float salary;
	private String type;

	public String getType() {
		return type;
	}
	public String getName() {
		return name;
	}

	public float getSalary() {
		return salary;
	}

	public Worker(String name, float salary, String type) {
		super();
		this.name = name;
		this.salary = salary;
		this.type=type;
	}

	void pay() {
		System.out.print("\nworker salary is \n");
	}
}

class DailyWorker extends Worker {
	private int noOfDays;

	public DailyWorker(String name, float salary, String type, int noOfDays) {
		super(name, salary, type);
		this.noOfDays = noOfDays;
	}

	@Override
	void pay() {
//		super.pay();
		System.out.print(getNoOfDays()*getSalary());
		
	}

	public int getNoOfDays() {
		return noOfDays;
	}

}

class SalariedWorker extends Worker {
	private int week;

	public SalariedWorker(String name, float salary, String type, int week) {
		super(name, salary, type);
		this.week = week;
	}

	public int getWeek() {
		return week;
	}

	public void setWeek(int week) {
		this.week = week;
	}

	@Override
	void pay() {
	//	super.pay();
		System.out.print(getWeek()*getSalary());
	}
}