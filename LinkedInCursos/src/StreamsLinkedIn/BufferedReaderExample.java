package StreamsLinkedIn;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		File myFile = new File("example.txt");
		try {
			BufferedReader reader = new BufferedReader(new FileReader(myFile));
			String line;
			while((line = reader.readLine()) != null) {
				System.out.println(line);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
