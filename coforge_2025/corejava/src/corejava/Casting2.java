package corejava;

class Animal {

}

class Dog extends Animal {
	// Dog is a animal
}

public class Casting2 {

	public static void main(String[] args) {
		Dog dog = new Dog();
		Animal animal = new Animal();
        //animal=dog;
		
		 // animal is a dog 
		
        dog=(Dog)animal;
        
	}
}
