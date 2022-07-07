package StreamsLinkedIn;

import java.io.*;

public class TryWithResourcesExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try(BufferedReader reader = new BufferedReader(new StringReader("Hello World"));
				StringWriter writer = new StringWriter();) {
			writer.write(reader.readLine());
			System.out.println(writer.toString());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//Los resources se colocan dentro () despues de try, esto hace que se cierren automaticamente y previene de leaks

	}

}
