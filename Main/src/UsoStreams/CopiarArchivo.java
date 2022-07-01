package UsoStreams;

import java.io.*;

public class CopiarArchivo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CopiarArchivo cp = new CopiarArchivo(args);
		cp.duplicar();
		

	}
	
	public FileInputStream fi;
	public FileOutputStream fo;
	public byte[] b;
	public File archivoE, archivoS;
	
	
	public CopiarArchivo(String[] args) {		
		if(args.length == 2) {
			try {
			archivoE = new File(args[0]);
			archivoS = new File(args[1]);	
			} catch (Exception e) {
				System.err.println(e.getMessage());
				System.exit(0);
			} 
		} else {
				System.out.println("Tenemos el original");
			
		}
	}
	
	public void duplicar() {
		
		System.out.println("Arrancamos " + System.currentTimeMillis());
		
		try {
		fi = new FileInputStream(archivoE);
		fo = new FileOutputStream(archivoS);
		b = new byte[(int)archivoE.length()];
		System.out.println("¡Listo! " + System.currentTimeMillis());
		fi.read(b);
		System.out.println("Terminamos de leer " + System.currentTimeMillis());
		fo.write(b);
		fi.close();
		fo.close();
		System.out.println("Terminamos de escribir " + System.currentTimeMillis());
		} catch (Exception e){
			
		}
	}

}
