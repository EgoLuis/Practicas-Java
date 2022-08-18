package Java8NewFeatures;

import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

public class CipherMain {

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
		
		Cipher_LambdaExp l1=new Cipher_LambdaExp();
		System.out.print("Lambda Expression : ");
		l1.lambdaExpression(list);
		
		Cipher_MethodRef m1=new Cipher_MethodRef();
		System.out.print("\nMethod Reference : ");
		m1.methodReference(list);
		
		Cipher_Anonymous a1=new Cipher_Anonymous();
		System.out.print("\nAnonymous Class : ");
		a1.anonymousClass(list);
	}

}

interface AnonymousInterface
{
    void getCipher(ArrayList<String> list);
}

class Cipher_Anonymous
{
    void anonymousClass(ArrayList<String> list) 
    {
    	AnonymousInterface result = new AnonymousInterface() {

			public void getCipher(ArrayList<String> list) {
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
				
			}
    		
    	};
    	
    	result.getCipher(list);
    }
}


class Cipher_MethodRef
{
    void methodReference(ArrayList<String> list)        
    {
    	List<String> newList = list.stream()
    			.map(Cipher_MethodRef::cipher2)
    			.collect(Collectors.toList());
    	String result = "";
    	for(String e:newList) {
    		result=result+e;
    	}
    	
    	System.out.println(result);
    }
    
    static String cipher2(String word) {
    	int ascii = (int)word.charAt(0);
    	String removeF = word.substring(1);
		String addAscii = ascii + removeF;
		String reverse="";
		for(int j = addAscii.length(); j>0; j--) {
			reverse = reverse + addAscii.charAt(j-1);
		}
		if(reverse.equals("23")) {
			return "$#";
		} else {
			return reverse;
		}
    }
}



class Cipher_LambdaExp
{
    void lambdaExpression(ArrayList<String> list) {
        
    	List<String> newList = list.stream()
    			.map(e -> cipher(e))
    			.collect(Collectors.toList());
    	String result = "";
    	for(String e:newList) {
    		result=result+e;
    	}
    	
    	System.out.println(result);
    	
    }
    
    String cipher(String word) {
    	int ascii = (int)word.charAt(0);
    	String removeF = word.substring(1);
		String addAscii = ascii + removeF;
		String reverse="";
		for(int j = addAscii.length(); j>0; j--) {
			reverse = reverse + addAscii.charAt(j-1);
		}
		if(reverse.equals("23")) {
			return "$#";
		} else {
			return reverse;
		}
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
