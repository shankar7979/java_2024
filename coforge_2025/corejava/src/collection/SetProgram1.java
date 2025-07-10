package collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class SetProgram1 {

	public static void main(String[] args) {

		List<String> cityList = new ArrayList<String>(); // empty array List

		cityList.add("new delhi");
		cityList.add("mathura");
		cityList.add("aagra");
		cityList.add("new delhi");
		cityList.add("kolkotta");
		cityList.add("gurgaon");
		cityList.add("mathura");

		System.out.println(cityList);
		

//		Set<String> set1=new HashSet<>();  // empty set
		Set<String> set1 = new HashSet<>(cityList);

		System.out.println(set1); // set has no duplicate , no index

		// traverse element using older api enumeration and iterator

		System.out.println("for each ");
		for (String string : set1) {
			System.out.print(string + ",");
		}

		Iterator<String> iterator = set1.iterator();

		while (iterator.hasNext()) {
			System.out.print(iterator.next());
			iterator.remove();
		}
		System.out.println("\n" + set1 + "  is empty ");
	}
}
