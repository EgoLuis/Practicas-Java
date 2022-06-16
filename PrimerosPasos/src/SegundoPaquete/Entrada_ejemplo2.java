package SegundoPaquete;
import javax.swing.*;

public class Entrada_ejemplo2 {

	public static void main(String[] args) {
		
		String nombre_usuario = JOptionPane.showInputDialog("Introduce tu nombre");
		
		String edad = JOptionPane.showInputDialog("Introduce tu edad");
		
		int edad_usuario = Integer.parseInt(edad); //método para transformar un dato de tipo String a tipo int
		
		edad_usuario++;
		
		System.out.println("Hola " + nombre_usuario + ". El año que viene tendrás " + edad_usuario + " años.");
		

	}

}
