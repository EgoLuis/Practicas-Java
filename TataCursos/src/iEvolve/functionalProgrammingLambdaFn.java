package iEvolve;

import java.util.*;
import java.util.stream.*;

public class functionalProgrammingLambdaFn {
	
	public List<Long> functionalProgramming(List<String> listOfIntegers)
    {
        //Write your code here
		
        List<Long> outputList = listOfIntegers.stream()
				.map(Long::parseLong)
				.filter(n -> narcisista(n) == true)
				.collect(Collectors.toList());
        return outputList;
    }
	
	
	
	
	
	long countDigits(long number) {
		if (number == 0) return 0;
		return 1 + countDigits(number/10);
	}
	
	boolean narcisista(long number) {
		long pwr = countDigits(number);
		long n = number;
		long sum = 0;
		while(n>0) {
			sum += Math.pow(n%10, pwr);
			n = n/10;
		}
		return(number == sum);
	}

}


