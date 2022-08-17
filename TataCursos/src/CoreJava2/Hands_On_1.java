package CoreJava2;

public class Hands_On_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    System.out.println(operationCount(originalString, 1, 1));
	  }


	static String originalString="abcabc";
	
	private static int operationCount(String word, int input1,int input2){
	  
      String exp = word;
      int contador = 0;
      boolean flag = true;
      
      do { 	  
    	  if(flag) {
    		  for(int i = 0; i < input1; i++) {
    			  exp = exp.charAt(exp.length()-1) + exp;
    			  exp = exp.substring(0,exp.length()-1);
    		  }
    		  flag = false;
    		  contador++;
    	  } else {
    		  for(int i = 0; i < input2; i++) {
    			  exp = exp.charAt(exp.length()-1) + exp;
    			  exp = exp.substring(0,exp.length()-1);
    		  }
    		  flag = true;
    		  contador++;
    	  }	  
      } while (!exp.equals(word));
      
	  return contador;
	}
}