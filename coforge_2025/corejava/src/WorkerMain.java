
public class WorkerMain {

	public static void main(String[] args) {
		DailyWorker worker1 = new DailyWorker("kamal kumar", 600, "D", 10);
		SalariedWorker worker2 = new SalariedWorker("kamal kumar", 4000, "W", 5);

		System.out.println("workers details ");

		System.out.println("\t name " + worker1.getName());
		System.out.println("\t daily salary " + worker1.getSalary());
		System.out.println("\t type " + worker1.getType());
		System.out.println("\t no of days  " + worker1.getNoOfDays());
		System.out.print("\t total salary " );
		 worker1.pay();

		System.out.println("\n-----------------------------");

		System.out.println("\t name " + worker2.getName());
		System.out.println("\t salary per week " + worker2.getSalary());
		System.out.println("\t type " + worker2.getType());
		System.out.println("\t no of weeks  " + worker2.getWeek());
		
		System.out.print("\t total salary " );
		 worker2.pay();


	}
}
