package excepciones_I;

import javax.swing.JOptionPane;

//Existen dos tipos de Excepciones principales: las que heredan de la clase RuntimeException y las que heredan de la clase IOException
//RuntimeException se refiere a una excepcion no comprobada por lo que no estamos obligados a programar un bloque try/catch, pero se pueden solventar de otras formas
//IOException se refere a una excepcion comprobada por lo que siempre hay que solventarla con un bloque try/catch

public class Fallos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] mi_matriz = new int[5];
		mi_matriz[0] = 5;
		mi_matriz[1] = 38;
		mi_matriz[2] = -15;
		mi_matriz[3] = 92;
		mi_matriz[4] = 71;
		
		for (int i=0; i<5; i++) {
			System.out.println("Posición " + i + " = " + mi_matriz[i]);
		}
		
		//Petición de datos personales
		
		String nombre = JOptionPane.showInputDialog("Introduce tu nombre");
		int edad = Integer.parseInt(JOptionPane.showInputDialog("Introduce tu edad"));
		System.out.println("Hola " + nombre + ". Tienes " + edad + " años. El programa terminó su ejecución.");
	}

}
