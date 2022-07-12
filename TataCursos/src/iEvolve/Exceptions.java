package iEvolve;

import java.util.Scanner;

public class Exceptions {
	
	private static final Scanner INPUT_READER = new Scanner(System.in);

	public static void main(String[] args) {
		
		String message = INPUT_READER.nextLine();
		
		 try {
	            String encrypted_message = Encrypter.encryptMessage(message);
	            if(! encrypted_message.startsWith("InvalidMessageException"))
	                System.out.println(encrypted_message);
	        } catch (Exception e) {
	            System.out.println(e);
	        }

	}
}

class Validator {
	public static boolean validate(String message) {
		return message.matches("[A-Za-z0-9 ]+");
	}
}

class Encrypter {
	public static String encryptMessage(String name) throws InvalidMessageException {
		boolean val = Validator.validate(name);
		String reverse = "";
		if(val) {
			String allLower = name.toLowerCase();
			for (int i = name.length() - 1; i >= 0; i--) {
				reverse += allLower.charAt(i);
			}
		} else {
			throw new InvalidMessageException();
		}
		return reverse;
	}
}

class InvalidMessageException extends Exception {

	@Override
	public String toString() {
		return "InvalidMessageException: Try again with valid message";
	}
	
}
