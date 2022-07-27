package iEvolve;

public class PackagesMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PackagesNumberFinder prueba = new PackagesNumberFinder();
		PackagesExtractString prueba2 = new PackagesExtractString();
		
		String text = "A: Hello, Priya 3 speaking. Is this Aditi? B: Yeah Priya! I am "
				+ "there 28. A: How are you dear? B: I am fine 19. What about you Priya 75? "
				+ "A:Glad to hear that! Me too fine! seven. Aditi how are your five holidays going?"
				+ " B:Great Priya! I am enjoying well!";

		String actual = "A: Is Alice available? "
				+ "B: You're talking 2208 to her. "
				+ "A: I've called you a nine times today. "
				+ "B: I was busy doing something 2580. I apologize. "
				+ "A: No problem. "
				+ "B: Did you need 2345 something? "
				+ "A: Do you want to do something 48 tomorrow? "
				+ "B: Is there somewhere special you wanted 76 to go? "
				+ "A: How about a movie? B: A movie sounds good. "
				+ "A: Call me tomorrow three times then. "
				+ "B: I will see you tomorrow.";
        
		
		
		String passOne = prueba.digitFinder(actual);
		String passTwo = prueba2.addDigits(actual);
		String passComplete = passOne + passTwo;
		
		
		System.out.println(passComplete);
		

	}

}
