package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListProgram2 {

	public static void main(String[] args) {
		
		List<String> cityList=new ArrayList<String>(); // empty array List
		
		//cityList.add(66556);
		cityList.add("new delhi");
		cityList.add("mathura");
		cityList.add("aagra");
		cityList.add("new delhi");
		cityList.add("kolkotta");
		cityList.add("gurgaon");
		cityList.add("mathura");
		
		System.out.println(cityList);
		System.out.println("using for loop ");
		for (int i = 0; i < cityList.size(); i++) {
		  System.out.print(cityList.get(i)+", ");	
		}
		
		System.out.println("using for  each loop ");
		for (String s:cityList) {
			System.out.print(s+", ");	
		}
		
		Collections.sort(cityList);
		System.out.println("sorted city list "+cityList);
		
		int pos=Collections.binarySearch(cityList,"aagra");
		if(pos>=0)
			System.out.println("found at "+pos);
		else 
			System.out.println("not found");
		
	}
}
