package iEvolve;

import java.util.*;
import java.util.Map.Entry;

public class TreemapMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String cricketDataset = "3,Dhoni,120|1,Virat,103|5,Jadeja,40|2,Rohit,70|4,Pandya,30";
		
		String cricketDataset3 = "3,Rohit,100|2,Virat,56|1,Dhoni,150\n"
							   + "3,Rahul,90|2,Virat,100|1,Rohit,99\n"
							   + "1,Rahul,50|2,Virat,64|3,Rohit,78\n"
							   + "1,Dhoni,95|2,Virat,30|3,Rohit,45\n"
							   + "3,Jadeja,43|2,Virat,54|1,Rohit,40|4,Dhoni,59";
		
		String query1 = "1 3 5";
		String query2 = "2 50";
		String query3 = "3";
		
		String test4 = "1,Rohit,100|2,Virat,56|3,Dhoni,150\n"
				+ "3,Rahul,90|2,Virat,100|1,Rohit,99\n"
				+ "1,Rahul,50|2,Virat,64|3,Rohit,78\n"
				+ "1,Dhoni,95|2,Virat,30|3,Rohit,45\n"
				+ "1,Jadeja,43|2,Virat,54|3,Rohit,78|4,Dhoni,59\n"
				+ "1,Rahul,60|2,Virat,56|3,Rohit,69";
		
		 String test5 = "3,Rohit,100|2,Virat,56|1,Dhoni,150\n"
		 		+ "3,Rahul,90|2,Virat,100|1,Rohit,99\n"
		 		+ "1,Rahul,50|2,Virat,64|3,Rohit,78\n"
		 		+ "1,Dhoni,95|2,Virat,30|3,Rohit,45\n"
		 		+ "1,Jadeja,43|2,Virat,54|3,Rohit,78|4,Dhoni,59\n"
		 		+ "1,Rahul,60|2,Virat,56|3,Rohit,69";
	        
        
		
		TreemapHandson test = new TreemapHandson();
		
		String result = test.getQuery(test4, query3);
		
		System.out.println(result);

		
		
	}

}
