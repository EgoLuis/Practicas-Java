package SegundoPaquete;
import javax.swing.*;

public class Acceso_aplicacion_bucle {

	public static void main(String[] args) {
		
		String clave = "Luis";
		String pass = "";
		
		while(clave.equals(pass) == false) {
			
			pass=JOptionPane.showInputDialog("Introduce la contraseņa");
			if(clave.equals(pass)==false) {
				System.out.println("Contraseņa incorrecta");
			}			
		}
		System.out.println("Contraseņa correcta. Acceso permitido");
	}

}
