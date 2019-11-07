import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

import org.junit.jupiter.api.Test;

class EmployeeAdminTest {

	@Test
	void prepareSsnReportTest() {

		List<String> ssns = Arrays.asList("234121244", "113145657", "342892138", "999234124",
				"553667742", "212341557", "115513151");

		HashMap<String, Employee> h = new HashMap<String, Employee>() {
			{
				put("523421589", new Employee("Tom", 88000, "523421589"));
				put("234121244", new Employee("Bob", 78000, "234121244"));
				put("212341557", new Employee("Hank", 110000, "212341557"));
			}
		};
		
		List<String> expected = Arrays.asList("523421589");
		List<String> actual = EmployeeAdmin.prepareSsnReport(h, ssns);
		
		assertEquals(expected,actual);
 		
	}
	
	@Test
	void prepareEmpReportTest() {
		List<String> ssns = Arrays.asList("234121244", "113145657", "342892138", "999234124",
				"553667742", "212341557", "115513151");
		
		//Employee employee1 = new Employee("Hank", 110000, "212341557");
		Employee e =new Employee("Hank", 110000, "212341557");
		HashMap<String, Employee> h = new HashMap<String, Employee>() {
			

			{
				put("523421589", new Employee("Tom", 88000, "523421589"));
				put("234121244", new Employee("Bob", 78000, "234121244"));
				put("212341557",e);
			}
		};
		
		
		List<Employee> expected = Arrays.asList(e);
		List<Employee> actual = EmployeeAdmin.prepareEmpReport(h, ssns);
		
		assertEquals(expected,actual);
	}


}
