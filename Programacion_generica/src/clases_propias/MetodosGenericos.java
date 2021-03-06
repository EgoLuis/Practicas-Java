package clases_propias;

import java.util.GregorianCalendar;

public class MetodosGenericos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String nombres[] = {"Jose", "Mar?a", "Pepe"};
		
		/*
		String elementos = MisMatrices.getElementos(nombres);
		
		System.out.println(elementos);
		
		Empleado listaEmpleados[] = {new Empleado("Ana", 45, 2500), new Empleado("Ana", 45, 2500), new Empleado("Ana", 45, 2500),
				new Empleado("Ana", 45, 2500),new Empleado("Ana", 45, 2500)};
		
		System.out.println(MisMatrices.getElementos(listaEmpleados));
		*/
		
		System.out.println(MisMatrices.getMenor(nombres));
		
		GregorianCalendar fechas[]= {new GregorianCalendar(2015,07,12),
				new GregorianCalendar(2015,07,12),
				new GregorianCalendar(2015,07,12),
				new GregorianCalendar(2015,07,12)
				};
		
		System.out.println(MisMatrices.getMenor(fechas));
		
		}

}

class MisMatrices{
	
	public static <T> String getElementos(T[]a) { //este m?todo recibe un elemento gen?rico y devuelve un String
		return "El array tiene " + a.length + " elementos.";	
	}
	
	public static <T extends Comparable> T getMenor(T[]a) { //este m?todo recibe un elemento gen?rico y devuelve el mismo tipo, para usar el m?todo compareTo el elemento debe heredar de Comparable
		if(a==null || a.length==0) {
			return null;
		}
		
		T elementoMenor = a[0];
		
		for (int i=1; i<a.length;i++) {
			if(elementoMenor.compareTo(a[i])>0) {
				elementoMenor=a[i];
			}
		}
		
		return elementoMenor;
		
		
		
	}
	
}