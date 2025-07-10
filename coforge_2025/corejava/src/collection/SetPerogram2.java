package collection;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetPerogram2 {

	public static void main(String[] args) {
		Set<String> languages=new  TreeSet<String>();  //  no order, sorted  , no duplicates
				//LinkedHashSet<String>(); // ordered , no duplicates
				//HashSet<String>(); // no order , no duplicates
		
		languages.add("java");
		languages.add("java script");
		languages.add("dot net");
		languages.add("python");
		languages.add("java");
		languages.add("python");
		languages.add("nodejs");
		
		System.out.println(languages);
	}
}
