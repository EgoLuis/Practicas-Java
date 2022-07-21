package iEvolve;

public class RegexMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		RegexExercise test = new RegexExercise();
		
		String text = "Manager: Good morning, sir. How can I help you?\r\n"
				+ "Customer: Sir, the card names in my cards have got scratched, and I am unable to find their types. Would you be able to help me find the type using the card numbers, please?\r\n"
				+ "Manager: What are the types of cards you have, sir?\r\n"
				+ "Customer: I have a Visa, American Express, Discover and JCB cards.\r\n"
				+ "Manager: Okay sir Can I have your account number and mobile number?\r\n"
				+ "Customer: My account number is 1356798988878, and my mobile number is 8765465743.\r\n"
				+ "Manager:Can you tell me the card numbers, sir?\r\n"
				+ "Customer: The card numbers are 4769856453217, 340987687654689, 213189796876789, 6011675489757876, and 3589797987979879.\r\n"
				+ "Manager: Please wait a minute, sir.\r\n"
				+ "Customer: There are two other cards as well. The numbers are 4654465765767878 and 6589456879087568.\r\n"
				+ "Manager: Please give me a minute, sir.";
		
		String respuesta = test.findCardTypeNumbers(text,"JCB");
		System.out.println(respuesta);

	}

}

