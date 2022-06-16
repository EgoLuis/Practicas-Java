package LeyendoYEscribiendoBytes;

import java.io.*;

public class Lectura_Escritura {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int contador = 0;
		int datos_entrada[] = new int[177656];
	
		
		try {
			FileInputStream archivo_lectura = new FileInputStream("C:/Users/Admin/Desktop/PILDORAS INFORMATICAS/JavaLogo.jpg");
			boolean final_ar = false;
			
			while(!final_ar) {
				int byte_entrada = archivo_lectura.read();
				if(byte_entrada==-1) {
					final_ar = true;
				}else {
					datos_entrada[contador] = byte_entrada;
				}
				System.out.println(datos_entrada[contador]);
				contador++;
			}
			archivo_lectura.close();
			
		} catch (IOException e) {
			
			System.out.println("Error al leer el archivo");
		}
		System.out.println(contador);
		
		crea_fichero(datos_entrada);
	}
	
	static void crea_fichero(int datos_nuevo_fichero[]) {
		
		try {
			
			FileOutputStream fichero_nuevo = new FileOutputStream("C:/Users/Admin/Desktop/PILDORAS INFORMATICAS/JavaLogo_copia.jpg");
			for(int i = 0; i<datos_nuevo_fichero.length; i++) {
				fichero_nuevo.write(datos_nuevo_fichero[i]);
			}
			fichero_nuevo.close();
		
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("Error al crear el archivo");
		}
	}

}
