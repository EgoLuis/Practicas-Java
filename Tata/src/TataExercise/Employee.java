package TataExercise;

public class Employee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public Employee(int EmployeeId, String name, String address)
	{
		this.EmployeeId=EmployeeId;
		this.name=name;
		this.address=address;
	}
	public int getEmployeeId() {
		return EmployeeId;
	}
	public void setEmployeeId(int employeeId) {
		EmployeeId = employeeId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}

	private int EmployeeId;
	private String name;
	private String address;

}

