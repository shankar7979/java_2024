import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PersonTest {

	Person person;

	@BeforeEach
	void setUp() throws Exception {
		person = new Person(100001, "suman kumar", 35000, 0.05f);
	}

	@Test
	void testGetGrosssalary() {
		assertEquals(person.getGrosssalary(), 33250);
	}

	@Test
	void testGetPersonPf() {
		assertEquals(person.getPersonPf(), 0.05f);
	}

	@Test
	void testGetPersonId() {
		assertEquals(person.getPersonId(), 100001);
	}

	@Test
	void testGetPersonName() {
		assertEquals(person.getPersonName(), "suman kumar");
	}

	@Test
	void testGetPersonSalary() {
		assertEquals(person.getPersonSalary(), 35000);
	}

}
