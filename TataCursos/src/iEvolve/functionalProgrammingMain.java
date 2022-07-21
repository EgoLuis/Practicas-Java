package iEvolve;

import java.util.*;

public class functionalProgrammingMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//crea una lista de numeros de "a" a  "b" pero en una lista de enteros
		 int a=46;
         int b=1000;
         List<String> listOfIntegers = new ArrayList<>();
         for(long i=a;i<=b;i++)
         {
             listOfIntegers.add(i+"");
         }
         
         functionalProgrammingLambdaFn test1 = new functionalProgrammingLambdaFn();
         
         //metodo que devuelve que numeros son narcisistas de la lista dada
         List<Long> respuesta = test1.functionalProgramming(listOfIntegers);
         
         for(Long n : respuesta) {
        	 System.out.println(n);
         }

	}

}
