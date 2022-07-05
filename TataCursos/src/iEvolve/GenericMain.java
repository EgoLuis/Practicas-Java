package iEvolve;

public class GenericMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		String studentData ="Raja Ravi Vinay Rahul Arun";
		String query ="2,B- AB- B+ O+ B+,B+";
		*/
		
		String studentData ="5.6 6.7 8.9 5.8";
		String query ="5";
		
		GenericStudentClass prueba = new GenericStudentClass();
		
		System.out.println(prueba.getQuery(studentData, query));

	}

}
