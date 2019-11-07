package lesson10.labs.prob5.soln1;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

import lesson10.labs.prob5.Employee;
import lesson10.labs.prob5.Main;

class MainTest {

	@Test
	public void testAsString() {
		List<Employee> emps = Arrays.asList(new Employee("Steven", "Walters", 135000),
				new Employee("Thomas", "Blake", 111000),new Employee("Joe", "Stevens", 200000));
		assertEquals("Joe Stevens,Steven Walters", Main.asString(emps));
	}
	
}
