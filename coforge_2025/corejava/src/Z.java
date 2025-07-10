class Y{
	int x=10;
	void display() {
		System.out.println("class Y display method");
	} 
}

public class Z  extends Y{
	int x=100;
	@Override
	void display() {
		super.display();
		System.out.println("class Z display method");
		int x=1000;// local variable 
		System.out.println("local variable x "+x);
		System.out.println("instance variable x "+this.x);
		System.out.println("super class variable x "+super.x);
	}

	public static void main(String[] args) {
		new Z().display();
	}
}
