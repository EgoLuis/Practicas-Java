package SegundoPaquete;
import javax.swing.*;

public class Acceso_aplicacion_bucle {

	public static void main(String[] args) {
		
		String clave = "Luis";
		String pass = "";
		
		while(clave.equals(pass) == false) {
			
			pass=JOptionPane.showInputDialog("Introduce la contrase�a");
			if(clave.equals(pass)==false) {
				System.out.println("Contrase�a incorrecta");
			}			
		}
		System.out.println("Contrase�a correcta. Acceso permitido");
	}

}
