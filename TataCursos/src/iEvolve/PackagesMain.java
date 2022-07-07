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
	
		
		String passOne = prueba.digitFinder(text);
		String passTwo = prueba2.addDigits(text);
		String passComplete = passOne + passTwo;
		
		
		System.out.println(passComplete);
		

	}

}
