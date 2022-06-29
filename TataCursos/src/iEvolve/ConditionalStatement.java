package iEvolve;

import java.io.*;
import java.util.*;

public class ConditionalStatement {

	   public static void main(String[] args) throws IOException {
	        Scanner sc = new Scanner(System.in);
	

	        int students_marksRows = Integer.parseInt(sc.next().trim());
	        int students_marksColumns = Integer.parseInt(sc.next().trim());
			
			
			int[][] students_marks = new int[students_marksRows][students_marksColumns];
			for(int i = 0; i < students_marksRows; i++)
	        {
				for(int j = 0; j < students_marksColumns; j++)
				{
					students_marks[i][j] = Integer.parseInt(sc.next().trim());				
				}
	        }

	        String[] result = Result.calculateGrade(students_marks);
			
			for(int i = 0; i < result.length; i++)
	        {
				System.out.println(result[i]);
	  
	        }       
	      
	    }
}


class Result {

    /*
     * Complete the 'calculateGrade' function below.
     *
     * The function is expected to return a STRING_ARRAY.
     * The function accepts 2D_INTEGER_ARRAY students_marks as parameter.
     */

    public static String[] calculateGrade(int[][] students_marks) {
        
        int contadorCalif = 0;
        int contadorElem = 0;
        int i = 0;
        double promedio=0;
        String[] resultados = new String[students_marks.length];
        
        for(int[] subMatriz : students_marks){
            contadorCalif = 0;
            contadorElem = 0;
            for(int calif : subMatriz){
                contadorCalif = contadorCalif + calif;
                contadorElem++;
            }
            promedio=(contadorCalif/contadorElem);
            if(promedio>=90){
                resultados[i] = "A+";
            }else if(promedio>=80){
                resultados[i] = "A";
            }else if(promedio>=70){
                resultados[i] = "B";
            }else if(promedio>=60){
                resultados[i] = "C";
            }else if(promedio>=50){
                resultados[i] = "D";
            }else{
                resultados[i] = "F";
            }
            i++;
        }
        
        return resultados;

    }

}