package CoreJava2;

public class Hands_On_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String json = "{\"0\":{\"name\":\"John\"},"
				+ "\"1\":{\"name\":\"micheal\"}}";
		
		System.out.println(levelCount(json));
	}
	
	public static int levelCount(String word){
	    int count = 1;
	    int prov = 0;
	    String[] splits = word.split(",");
	    
	    for(String s : splits) {
	    	for(int i = 0; i < s.length(); i++) {
	    		if(s.charAt(i) == '{') {
	    			prov++;
	    		}
	    	}
	    	if (prov > count) count = prov;
	    	prov = 0;
	    }
	    return count;
	  }
}




