
public class StringBufferPrg1 {

	public static void main(String[] args) {
		
		
		//StringBuffer buffer="hello" // not accepts string literal
		StringBuffer buffer=new StringBuffer("hello"); 
		// inside constructor accepts string literal 
		
		System.out.println(buffer);
		buffer.append("world");
		System.out.println(buffer);
		
		buffer.reverse();

		System.out.println(buffer);
		
		buffer.insert(3, "   mumbai  ");
		
		System.out.println(buffer);
		buffer.delete(2, 8);
		
		System.out.println(buffer);
		
		StringBuilder builder;// StringBuilder is not synchronized
		           // StringBuffer  not synchronized
		
	}
}
