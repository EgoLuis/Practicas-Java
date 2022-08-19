package Jabva8Qualis;

public class EligibilityCalculator {
	
	EmployeeInfo employeeInfo = new EmployeeInfo();
	
	public boolean eleigibleForHike (EmployeeInfo empInfo) {
		if(empInfo.employeeInfoValidator()) {
			if(empInfo.getSalary() > 24000 && empInfo.getDesignation().equals("Manager")) return true;
			else return false;
		} else {
			throw new IllegalArgumentException("Incorrect Employee Info passed");
		}
	}

}
