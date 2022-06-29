import java.math.BigDecimal;
import java.util.Scanner;

public class ConversorEuroADolar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Bienvenido al conversor de moneda");
		System.out.println("Introduce la cantidad de Euros");
		double euros = scan.nextDouble();
		double dolares = euros * 1.05;
		System.out.println(euros + " euros equivalen a " + dolares + " dolares.");
		
		String eurosString = Double.toString(euros);
		BigDecimal eurosBigDecimal = new BigDecimal(eurosString);
		double tasaDeCambio = 1.05;
		String tasaDeCambioString = Double.toString(tasaDeCambio);
		BigDecimal tasaDeCambioBigDecimal = new BigDecimal(tasaDeCambioString);
		
		BigDecimal dolaresBigDecimal = eurosBigDecimal.multiply(tasaDeCambioBigDecimal);
		System.out.println(euros + " euros equivalen a " + dolaresBigDecimal + " dolares.");

	}

}
