package iEvolve;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Polymorphism {

	public static void main(String[] args) throws Exception {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT */
		int startE, endE;
		Scanner scanner = new Scanner(System.in);
		startE = Integer.parseInt(scanner.nextLine());
		endE = Integer.parseInt(scanner.nextLine());
		
		ChildOne ch1 = new ChildOne(startE, endE);
		ChildTwo ch2 = new ChildTwo(startE, endE);
		
		System.out.println(ch1.filter());
		System.out.println(ch2.filter());
    }

}

class Parent{
	
	public int startElement;
	public int endElement;
	
	public Parent(int startElement, int endElement) {
		this.startElement = startElement;
		this.endElement = endElement;
	}
	
	String filter() {
		return null;
	}
	
}


class ChildOne extends Parent{
	
	public ChildOne(int startElement, int endElement) {
		super(startElement, endElement);
	}

	String filter() {
		
		String result = "";
		boolean flag = true;
		if(startElement<=2) {
			result ="2 ";
			startElement=3;
		}
		for(int i=startElement; i<=endElement; i++) {
			flag = true;
			
			for(int j=2; j<i; j++ ) {
				if(i%j==0) {
					flag=false;
				}
			}
			if(flag) {
				result = result + String.valueOf(i) + " ";			
			}
		}
		result.trim();
		
		return result;
	}
}

class ChildTwo extends Parent{
	
	public ChildTwo(int startElement, int endElement) {
		super(startElement, endElement);
	}

	String filter() {
		String result = "";
		int happy = 0;
		
		for(int i=startElement; i<=endElement; i++) {
			happy = happyN(i);
			if(happy==1 || happy==7) {
				result = result + String.valueOf(i) + " ";	
			}
		}
		result.trim();
		return result;
	}
	
	
	int happyN(int n) {
		int num = n;
		int a = 0;
		int b = 0;
		int c = 0;
		
		while(num>=10) {
			a=num;
			c=0;
			while(a!=0) {
				b = a%10;
				c = c + (b*b);
				a=a/10;
			}
			num = c;
		}
		return num;
	}
}