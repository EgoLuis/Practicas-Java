package excepciones_I;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Areas_Peso_UsoFinally {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Elige una opción: \n1: Cuadrado \n2: Rectángulo \n3: Triángulo \n4: Círculo");
		try {
		figura = entrada.nextInt();
	
		}catch(Exception e) {
			System.out.println("Ha ocurrido un error");
		}finally { //Lo que se encuentra en el bloque finally se ejecutara independientemente si entra al catch o al try
			entrada.close();
		}
		
		switch (figura) {
		
		case 1:
			int lado = Integer.parseInt(JOptionPane.showInputDialog("Introduce el lado"));
			System.out.println("El área del cuadrado es: " + Math.pow(lado, 2));
			break;
		
		case 2:	
			int base = Integer.parseInt(JOptionPane.showInputDialog("Introduce la base"));		
			int altura = Integer.parseInt(JOptionPane.showInputDialog("Introduce la altura"));		
			System.out.println("El área del rectángulo es: " + base*altura);
			break;
			
		case 3:	
			int baseT = Integer.parseInt(JOptionPane.showInputDialog("Introduce la base"));		
			int alturaT = Integer.parseInt(JOptionPane.showInputDialog("Introduce la altura"));		
			System.out.println("El área del triángulo es: " + baseT*alturaT/2);
			break;
			
		case 4:	
			int radio = Integer.parseInt(JOptionPane.showInputDialog("Introduce el radio"));			
			System.out.println("El área del círculo es: " + Math.PI*(Math.pow(radio,2)));
			break;
			
		default:
			System.out.println("La opción no es correcta");
		}
		
		//----------------------------------------------------------------------------------------------------
		
		int altura = Integer.parseInt(JOptionPane.showInputDialog("Introduce tu altura en cm"));
		System.out.println("Si eres hombre tu peso ideal es: " + (altura-110) + " kg");
		System.out.println("Si eres mujer tu peso ideal es: " + (altura-120) + " kg");
		
	}
	
	static int figura;
	
}

