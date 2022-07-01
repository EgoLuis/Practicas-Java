package ArraysYOtrosDatos;

import java.io.*;
import java.nio.file.*;

public class InputOutputStreamUse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		//Codigo para leer un archivo de texto
		Path inputPath = Paths.get("C:\\Users\\Admin\\Desktop\\Tata\\Tata Courses\\ejemplo.txt");
		InputStream input;
		try {
			input = Files.newInputStream(inputPath, StandardOpenOption.READ);
			int i;
			while((i = input.read()) != -1) {
				System.out.print((char)i);
			}
			input.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//
		*/
		
		Path inputPath = Paths.get("C:\\Users\\Admin\\Desktop\\Tata\\Tata Courses\\ejemplo.txt");
		Path outputPath = Paths.get("C:\\Users\\Admin\\Desktop\\Tata\\Tata Courses\\ejemplo2.txt");
		
		try {
			InputStream inputStream = Files.newInputStream(inputPath, StandardOpenOption.READ);
			Files.newOutputStream(outputPath, StandardOpenOption.CREATE);
			OutputStream outputStream = Files.newOutputStream(outputPath, StandardOpenOption.WRITE);
			
			int i;
			
			byte[] data = new byte[1024];
			
			while((i = inputStream.read(data)) != -1) {
				outputStream.write(data);
			}
			
			inputStream.close();
			outputStream.close();
		
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
