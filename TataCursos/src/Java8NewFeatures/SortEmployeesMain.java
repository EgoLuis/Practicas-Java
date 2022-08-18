package Java8NewFeatures;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

//Este programa sirve para ordenar un ArrayList de Employee por orden alfabético de su nombre

public class SortEmployeesMain {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		ArrayList<Employee> empList=new ArrayList<>();
			
		System.out.println("¿Número de empleados?");
		 int n=Integer.parseInt(br.readLine().trim());
		 
		 System.out.println("Escribe en formato \"nombre\" \"id\" \"edad\"");
		 for(int i=0;i<n;i++)
		 {
			 String inp=br.readLine();
	         String inparr[]=inp.split(" ");
			 
			 Employee ws=new Employee(inparr[0],Integer.parseInt(inparr[1]), Integer.parseInt(inparr[2]));
			 empList.add(ws);
		 }
		
		SortEmployees s1=new SortEmployees();
		s1.sortEmployees(empList);

	}

}

class Employee
{
    private String name;
    private int id;
    private int age;
    
    
	public Employee(String name, int id, int age) {
		super();
		this.name = name;
		this.id = id;
		this.age = age;
	}
	
	public String getName() {
		return name;
	}

	public int getId() {
		return id;
	}
	
	public int getAge() {
		return age;
	}
  
}

class SortEmployees 
{
    void sortEmployees(ArrayList<Employee> empList) 
    {
    	empList.sort((o1, o2) -> 
    	o1.getName().compareTo(o2.getName()));
        
    	empList.forEach((o1) -> System.out.println(o1.getName() + " " + o1.getId() + " " + o1.getAge()));
    }
}
