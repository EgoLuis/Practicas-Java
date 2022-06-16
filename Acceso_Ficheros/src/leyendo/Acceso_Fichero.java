package leyendo;

import java.io.*;


public class Acceso_Fichero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Leer_Fichero accediendo = new Leer_Fichero();
		accediendo.lee();
		
	}

}

class Leer_Fichero{
	
	public void lee(){
		
		try {
		FileReader entrada = new FileReader("C:/Users/Admin/Desktop/PILDORAS INFORMATICAS/EjemploStreams.txt");
		int c = 0;
		while(c!=-1) {
			c = entrada.read();
			char letra=(char)c;
			System.out.print(letra);
		}
		entrada.close();
		}catch(IOException e) {
			System.out.println("No se ha encontrado el archivo");
		}
		
	}
	
}