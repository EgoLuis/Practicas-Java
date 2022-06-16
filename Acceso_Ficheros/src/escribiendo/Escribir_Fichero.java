package escribiendo;

import java.io.*;

public class Escribir_Fichero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Escribiendo acceso_esc = new Escribiendo();
		acceso_esc.escribir();
	}

}

class Escribiendo{
	
	public void escribir() {
		
		String frase = "Esto es una prueba de escritura";
		
		try {
			FileWriter escritura = new FileWriter("C:/Users/Admin/Desktop/PILDORAS INFORMATICAS/EjemploStreamsTextoNuevo.txt");
			for(int i=0; i<frase.length(); i++) {
				escritura.write(frase.charAt(i));
			}
			escritura.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}