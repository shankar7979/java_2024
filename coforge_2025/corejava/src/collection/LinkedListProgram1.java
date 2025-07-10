package collection;

import java.util.LinkedList;

public class LinkedListProgram1 {

	public static void main(String[] args) {
		
//		LinkedList<Integer> linkedList=new LinkedList<Integer>();
		var linkedList=new LinkedList<Integer>();
		
		linkedList.add(1001); // add element at last 
		linkedList.addFirst(1002);
		linkedList.addLast(1008);
		
		
		System.out.println(linkedList.get(0));
		System.out.println(linkedList.getFirst());
		System.out.println(linkedList.getLast());
		
		
		
	}
}
