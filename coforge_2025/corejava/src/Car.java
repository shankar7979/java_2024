
public class Car  extends Vehicle{
	
	private  String type;
	private int capacity;
	
	public static void main(String[] args) {
		Car car=new Car();
		car.id=88989898;
		car.cost=700000f;
		car.model="maruti";
		car.type="petrol";
		car.capacity=4;
		
		System.out.println("Car data ");
		System.out.println("Id  "+car.getId());
		System.out.println("Cost  "+car.getCost());
		System.out.println("Model  "+car.getModel());
		System.out.println("Type  "+car.type);
		System.out.println("Capacity  "+car.capacity);
	}
}
