package collection;

import java.util.ArrayList;
import java.util.List;

public class ListProgram1 {

	public static void main(String[] args) {
		
		List  list1=new ArrayList();
		list1.add(54434545);
		list1.add(new Integer(6565));
		
		list1.add("hello world");
		list1.add(656567.5556f);
		list1.add(new Employee());
	
		System.out.println(list1);
		
		list1.remove(0);  // remove using index
		list1.remove("hello world"); // remove using object
		
		System.out.println(list1.contains(6565));
		System.out.println(list1.get(0));          // get() allows to access with index
		
		System.out.println("using for each loop ");
		for(Object o:list1)
			System.out.print(o+",");
		
		System.out.println("\nusing for loop \n");
		for (int i = 0; i < list1.size(); i++) {
			System.out.print(list1.get(i)+", ");
		}
	}
}

class  Employee{}