package Jabva8Qualis;

import org.apache.commons.lang3.*;

public class EmployeeInfo {
	
	private int EmployeeId = 0;
	private String EmployeeName = "";
	private int age = 0;
	private double salary = 0.0;
	private String designation = "";
	public int getEmployeeId() {
		return EmployeeId;
	}
	public void setEmployeeId(int employeeId) {
		EmployeeId = employeeId;
	}
	public String getEmployeeName() {
		return EmployeeName;
	}
	public void setEmployeeName(String employeeName) {
		EmployeeName = employeeName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	
	public boolean employeeInfoValidator() {
		boolean isValid = true;
		if(StringUtils.isBlank(EmployeeName)) isValid = false;
		if(StringUtils.isBlank(designation)) isValid = false;
		if(age == 0 || age < 18 || age > 60 || salary == 0 || EmployeeId == 0) isValid = false;
		return isValid;
	}

}
