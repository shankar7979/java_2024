import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CalculatorTest {

	Calculator calculator;

	@BeforeEach
	void setUp() throws Exception {
		calculator = new Calculator();
	}

	@Test
	void testAddition() {
		assertEquals(calculator.addition(11, 22), 33);
		
	}
	@Test
	void testSubtraction() {
		assertEquals(calculator.subtraction(11, 2), 9);
	}
	
	@Test
	void testMultiplication() {
		assertEquals(calculator.multiplication(11, 5), 55);
	}
	
	@Test
	void testDivision() {
		assertEquals(calculator.division(11, 2), 5);
		assertEquals(calculator.division(11, 10), 1);
		assertEquals(calculator.division(11, 11), 1);
		assertEquals(calculator.division(11, 12), 0);
	}
	

}
