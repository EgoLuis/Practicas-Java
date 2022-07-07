package StreamsLinkedIn;

import java.util.Scanner;

public class PersonCreator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the name: ");
		String name = scanner.next();
		System.out.print("Enter the age: ");
		int age = scanner.nextInt();
		System.out.print("Enter a phone number: ");
		Long phoneNumber = scanner.nextLong();
		Person person = new Person(name, age, phoneNumber);

	}

}
