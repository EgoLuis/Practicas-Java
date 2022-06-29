package iEvolve;

import java.io.IOException;
import java.util.*;

public class ClassesAndObjectsBilling {

	 public static void main(String[] args) throws IOException {
	        
	        Scanner readInput = new Scanner(System.in);        
	        String[] input=readInput.nextLine().split(" ");                
	        Map<String,Integer> myItems=new HashMap<String,Integer>();
	        for(int i=0;i<input.length;i+=2){
	          myItems.put(input[i],Integer.parseInt(input[i+1]));	
	        }
	        Register regObj = Register.getInstance();        
	        System.out.println(regObj.getTotalBill(myItems));
	        readInput.close();
	        
	    }

}

class Register {
    
    private static Register register = null;
    /*
     * Complete the 'getTotalBill' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts MAP itemDetails as parameter.
     */

    public String getTotalBill(Map<String,Integer> itemDetails) {
    	
    	double appleV = 0, appleTotal = 0;
    	double orangeV = 0, orangeTotal = 0;
    	double mangoV = 0, mangoTotal = 0;
    	double grapeV = 0, grapeTotal = 0;
    	
    	if(itemDetails.containsKey("orange")) {
    		orangeV = itemDetails.get("orange");
    		orangeTotal = orangeV * 1.5;
    	}
    	
    	if(itemDetails.containsKey("mango")) {
    		mangoV = itemDetails.get("mango");
    		mangoTotal = mangoV * 1.2;
    	}
    	
    	if(itemDetails.containsKey("apple")) {
    		appleV = itemDetails.get("apple");
    		appleTotal = appleV * 2;
    	}
    	
    	if(itemDetails.containsKey("grape")) {
    		grapeV = itemDetails.get("grape");
    		grapeTotal = grapeV * 1;
    	}
    	
    	double bill = orangeTotal + mangoTotal + appleTotal + grapeTotal;
    	
    	return String.valueOf(bill);
    }
    
    public static Register getInstance() {
    	if(register==null) {
    		register = new Register();
    	}
    	return register;
    }

}