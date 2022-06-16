package leyendo;

import java.io.*;


public class Acceso_Fichero_Buffer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Leer_Fichero_Buffer accediendo = new Leer_Fichero_Buffer();
		accediendo.lee();
		
	}

}

class Leer_Fichero_Buffer{
	
	public void lee(){
		
		try {
		
		FileReader entrada = new FileReader("C:/Users/Admin/Desktop/PILDORAS INFORMATICAS/EjemploStreams.txt");
		BufferedReader miBuffer = new BufferedReader(entrada); //un buffer es una memoria intermedia que se coloca entre el programa de Java y el archivo al cual se quiere acceder
		String linea="";
		
		while(linea!=null) {
			linea = miBuffer.readLine();
			if(linea!=null) {
			System.out.println(linea);
			}
		}
		
		entrada.close();
		
		}catch(IOException e) {
			System.out.println("No se ha encontrado el archivo");
		}
		
	}
	
}