// final class can not be inherited 
public final class   Formula {

  	float speed(float distance, float time) {
		return distance/time;
	}
	
}

class  MyFormula extends Formula{
	@Override
	float speed(float distance, float time) {
		return distance/time*2;;
	}
	
}

 // final methods can be inherited but can not be overridden
 // static method can be inherited but  can not be overridden, can be re written
class Example1 {
	final void hello() {
		System.out.println("hello");
	}
	void greeting() {
		System.out.println("greeting");
	}
	
	static void show() {
		System.out.println("show method");
	}
}

class Example2 extends Example1{
	@Override
	void greeting() {
		super.greeting();
	}
	@Override
	void hello() {
		super.hello();
	}
	 // re writing of static method 
	//@Override
	static void show() {
		System.out.println("show method....");
	}
	
}