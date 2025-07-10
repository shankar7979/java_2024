class A {
	public A() {
		super();
		System.out.println("constructor A called");
	}
}

class B extends A {
	public B() {
		super();
		System.out.println("constructor B called");
	}
}

public class C extends B {
	public C() {
		super();
		System.out.println("constructor C called");

	}
	public static void main(String[] args) {
		new C();
	}
}
