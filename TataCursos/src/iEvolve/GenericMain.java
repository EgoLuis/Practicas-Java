package iEvolve;

import java.util.*;

public class GenericMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/////PROBANDO GENERIC STUDENT CLASS
		/*
		//String studentData ="Raja Ravi Vinay Rahul Arun";
		//String query ="2,B- AB- B+ O+ B+,B+";
		
		
		String studentData ="5.6 6.7 8.9 5.8";
		String query ="5";
		
		GenericStudentClass prueba = new GenericStudentClass();
		
		System.out.println(prueba.getQuery(studentData, query));
		*/
		
		//PROBANDO GENERIC STUDENT LIST
		
		GenericStudentList<String> listaEstu = new GenericStudentList<String>();
		listaEstu.addElement("Raja");
		listaEstu.addElement("Ravi");
		listaEstu.addElement("Vinay");
		listaEstu.addElement("Rahul");
		listaEstu.addElement("Arun");
		
		String[] tiposSangre = {"B-", "AB-", "B+", "O+", "B+"};
		
		System.out.println(listaEstu.beginsWith("r"));
		System.out.println(listaEstu.bloodGroupOf(tiposSangre, "B+"));
		
		GenericStudentList<Integer> listaCalif = new GenericStudentList<Integer>();
		listaCalif.addElement(96);
		listaCalif.addElement(78);
		listaCalif.addElement(93);
		listaCalif.addElement(45);
		listaCalif.addElement(90);
		listaCalif.addElement(42);
		listaCalif.addElement(69);
		System.out.println(listaCalif.thresholdScore(90));
		
		//PROBANO GENERIC SCORE LIST
 		
		GenericScoreList<Double> listaCalif2 = new GenericScoreList<Double>();
		listaCalif2.addElement(5.6);
		listaCalif2.addElement(6.7);
		listaCalif2.addElement(8.9);
		listaCalif2.addElement(5.8);
		System.out.println(listaCalif2.averageValues());
		
		
	}

}
