package ficheros_directorios;
import java.io.*;

public class Creando {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		File ruta = new File("C:/Users/Admin/Desktop/PILDORAS INFORMATICAS/CURSO JAVA/nuevo_directorio");
		
		ruta.mkdir();
		
		File ruta2 = new File("C:/Users/Admin/Desktop/PILDORAS INFORMATICAS/CURSO JAVA/nuevo_directorio/nuevo_texto.txt");
		
		String archivo_destino = ruta2.getAbsolutePath();
		
		try {
			ruta2.createNewFile()
;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
		
		Escribiendo accede_es = new Escribiendo();
		
		accede_es.escribir(archivo_destino);
		
	}

}

class Escribiendo{
	
	public void escribir(String ruta_archivo) {
		String frase = "Esto es un ejemplo.";
		
		try {
			FileWriter escritura = new FileWriter(ruta_archivo);
			for(int i=0; i<frase.length(); i++){
				escritura.write(frase.charAt(i));
			}
			escritura.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}
	
}