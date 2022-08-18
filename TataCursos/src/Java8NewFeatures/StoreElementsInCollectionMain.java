package Java8NewFeatures;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.function.Consumer;
import java.util.function.Supplier;
import java.util.*;

public class StoreElementsInCollectionMain {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		String input=br.readLine();
		
		StoreElementsInCollection.storeElements(input);
	}

}

class StoreElementsInCollection {
	
    static void storeElements(String input) {
    	
    	Supplier<String> incorrect = () -> "Incorrect Input";
    	Supplier<String> corn = () -> "corn sandwich";
    	Supplier<String> veg = () -> "mix veg sandwich";
    	Supplier<String> cheese = () -> "cheese sandwich";
    	
        String[] list = input.split(",");
        
        List<String> sand = new ArrayList<String>();
        
        Consumer<String> addArrayList = x -> sand.add(x);
        
        for(String s:list) {
        	addArrayList.accept(s);
        }
        
        for(String e : sand) {
        	if(!e.startsWith("corn") && !e.startsWith("mix veg") && !e.startsWith("cheese")) {
        		System.out.println(incorrect.get());
        		return;
        	}
        }
        
        for(String e : sand) {
        	if(e.startsWith("corn")) System.out.println(corn.get());
        	else if(e.startsWith("mix")) System.out.println(veg.get());
        	else if(e.startsWith("cheese")) System.out.println(cheese.get());
        }
        
    }
}
