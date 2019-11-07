package lesson10.labs.prob5.soln2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import lesson10.labs.prob5.Employee;

class MainTest {

	@Test
	public void testSalaryGreaterThan100000() {
		Employee e = new Employee("Joe", "Cummings", 760000);
		assertEquals(true, Main.salaryGreaterThan100000(e));
	}

	@Test
	public void testLastNameAfterM() {
		Employee e = new Employee("Steven", "Walters", 135000);
		assertEquals(true, Main.lastNameAfterM(e));
	}

}
