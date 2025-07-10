
public class Person2 {
  void show() {
	  System.out.println("i m person");
  }
}

class Father  extends Person2{
	@Override
	void show() {
		System.out.println("i m father");
	}
}

class Passenger  extends Person2{
	@Override
	void show() {
		System.out.println("i m Passenger");
	}
}
class PersonMain{
	public static void main(String[] args) {
		Person2 person;
		//run time polymorphism
		person=new Father();
		person.show();
		
		person=new Passenger();
		person.show();
		
	}
} 

