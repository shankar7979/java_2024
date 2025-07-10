import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class StringPrg1Test {

	String s1,s2,s3;
	
	@BeforeEach
	void setUp() throws Exception {
	 s1="hello";
	 s2="hello";
	 s3=new String("hello");
	}

	@Test
	void test() {
		assertEquals(s1, s2);
		assertSame(s1, s2);  // assertSame checks the reference 
		
		assertEquals(s1, s3);
		//assertSame(s1, s3);
		assertNotSame(s1, s3);
	}

}
