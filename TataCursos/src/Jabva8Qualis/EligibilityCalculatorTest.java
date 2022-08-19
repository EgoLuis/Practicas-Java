package Jabva8Qualis;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class EligibilityCalculatorTest {
	
	EmployeeInfo employeeInfo = null;
	EligibilityCalculator eligibilityCalculator = new EligibilityCalculator();
	
	@BeforeEach
	public void setUp() throws Exception {
		employeeInfo = new EmployeeInfo();
	}
	
	@AfterEach
	public void tearDown() throws Exception {
		employeeInfo = null;
	}
	
	@Test
	public void testEligilibleForHike_ValidDesignation() {
		employeeInfo.setAge(35);
		employeeInfo.setDesignation("Manager");
		employeeInfo.setEmployeeName("Niket");
		employeeInfo.setSalary(49000.00);
		employeeInfo.setEmployeeId(526234);
		assertTrue(eligibilityCalculator.eleigibleForHike(employeeInfo));
	}
	
	@Test
	public void testEligilibleForHike_BlankDesignation() throws IllegalArgumentException {
		employeeInfo.setAge(35);
		employeeInfo.setDesignation(" ");
		employeeInfo.setEmployeeName("Niket");
		employeeInfo.setSalary(49000.00);
		employeeInfo.setEmployeeId(526234);
		assertThrows(IllegalArgumentException.class, () -> {
			eligibilityCalculator.eleigibleForHike(employeeInfo);
		});
	}
	
	@Test
	public void testEligilibleForHike_InvalidEmpID() throws IllegalArgumentException {
		employeeInfo.setAge(35);
		employeeInfo.setDesignation(" ");
		employeeInfo.setEmployeeName("Niket");
		employeeInfo.setSalary(49000.00);
		employeeInfo.setEmployeeId(0);
		assertThrows(IllegalArgumentException.class, () -> {
			eligibilityCalculator.eleigibleForHike(employeeInfo);
		});
	}

}
