package Java8NewFeatures;

import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

public class CipherMain2 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		ArrayList<String> list=new ArrayList<>();
		
		String input=br.readLine();
		String inputarr[]=input.split(" ");
		
		list.add(inputarr[0]);
		for(int i=0;i<inputarr.length-1;i++)
		 {
			list.add(" ");
			list.add(inputarr[i+1]);
		 }
		
		Cipher_LambdaExp2 l1=new Cipher_LambdaExp2();
		System.out.print("Lambda Expression : ");
		l1.lambdaExpression(list);
		
		Cipher_MethodRef2 m1=new Cipher_MethodRef2();
		System.out.print("\nMethod Reference : ");
		m1.methodReference(list);
		
		Cipher_Anonymous2 a1=new Cipher_Anonymous2();
		System.out.print("\nAnonymous Class : ");
		a1.anonymousClass(list);
	}

}

interface AnonymousInterface2
{
    void getCipher(ArrayList<String> list);
}

class Cipher_Anonymous2
{
    void anonymousClass(ArrayList<String> list) 
    {
        AnonymousInterface2 obj = new AnonymousInterface2(){
            @Override
            public void getCipher(ArrayList<String> list) {
                for(String x:list){
                    System.out.print(x);
                }
                
            }
        };
        obj.getCipher(list);
    }
    
}


class Cipher_MethodRef2
{
    void methodReference(ArrayList<String> list)        
    {
        AnonymousInterface2 obj = (list1) ->{
          list1.forEach(System.out::print);  
        };
        obj.getCipher(list);
    }
    
  
}



class Cipher_LambdaExp2
{
    void lambdaExpression(ArrayList<String> list) {
   
        AnonymousInterface2 obj = (list1) -> {
          for(int i=0;i<list1.size();i++){
              int ch = (int)list1.get(i).charAt(0);
              String req = list1.get(i).substring(1);
              list1.set(i,ch+req);
              if(list1.get(i).equals("32"))
                    list1.set(i,"#$");
              StringBuilder sb = new StringBuilder(list1.get(i));
              list1.set(i,sb.reverse().toString());
          }  
          for(String x:list1){
              System.out.print(x);
          }
        };
         obj.getCipher(list);
    	
    }
    

}

//Hi, how are you?

/*
 ArrayList<String> newList = new ArrayList<String>();
    	for(String e:list) {
    		newList.add(e);
    	}
    	
    	for(int i = 0; i < newList.size(); i++) {
    		int ascii = (int)newList.get(i).charAt(0);
    		String removeF = newList.get(i).substring(1);
    		String addAscii = ascii + removeF;
    		String reverse="";
    		for(int j = addAscii.length(); j>0; j--) {
    			reverse = reverse + addAscii.charAt(j-1);
    		}
    		if(reverse.equals("23")) {
    			newList.set(i, "$#");
    		} else {
    			newList.set(i, reverse);
    		}
    	}
    	
    	String result = "";
    	for(String e:newList) {
    		result=result+e;
    	}
    	
    	System.out.println(result);
 */
