package BasicosJava;

public class Casteo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int variableDeTipoInt = 10;
		float variableDeTipoFloat = variableDeTipoInt;
		double variableDeTipoDouble = variableDeTipoFloat;
		double otraVariableDeTipoDouble = 2.76;
		int otraVariableDeTipoInt = (int)otraVariableDeTipoDouble;
		System.out.println("El resultado del casteo es " + otraVariableDeTipoInt);
		
		byte variable1 = 100;
		byte variable2 = 50;
		
		byte suma = (byte)(variable1 + variable2);
		System.out.println("El resultado del casteo a byte es " + suma);
		
	}

}
