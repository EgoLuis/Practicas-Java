package Java8NewFeatures;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.function.*;
import java.util.stream.*;

public class PrimeComposite_FactorialMain {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(br.readLine().trim());
				
		 PrimeComposite_Factorial xyz=new PrimeComposite_Factorial();
		 
		 xyz.primeOrComposite(n);
		 xyz.findFactorial(n);

	}

}

class PrimeComposite_Factorial {
	
    
    void primeOrComposite(int n) {
    	
    	Predicate<Integer> isPrime = x -> {
        	if(x < 3) return true;
        	for(int i = 2; i < x; i++) {
        		if(x % i == 0) return false;
        	}
        	return true;
        };
    	
        Consumer<Integer> result = (Integer y) -> {
        	if(y == 1) System.out.println("Neither Prime Nor Composite");
        	else if(y == 0) System.out.println("Neither Prime Nor Composite");
        	else if(isPrime.test(y)) System.out.println("Prime");
        	else System.out.println("Composite");
        };
        
        result.accept(n);
        
    }
    
    
    
    void findFactorial(int n) {
        
    	Consumer<Integer> factorial = (Integer z) -> {
    		BigInteger result = new BigInteger("1");
    		for(int i = z; i > 1; i--) {
    			result = result.multiply(BigInteger.valueOf(i));
    		}
    		System.out.println(result);
    	};
    	
    	factorial.accept(n);
    }
    
    
}