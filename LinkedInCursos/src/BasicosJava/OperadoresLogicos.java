package BasicosJava;

public class OperadoresLogicos {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("False & False es " + (false & false));
		System.out.println("True & False es " + (true & false));
		System.out.println("False & True es " + (false & true));
		System.out.println("True & True es " + (true & true));
		System.out.println("");
		//El operador && es de circuito corto, es decir que si el primero ya es false, no revisa el segundo ya que el resultado será false
		System.out.println("False && False es " + (false && false));
		System.out.println("True && False es " + (true && false));
		System.out.println("False && True es " + (false && true));
		System.out.println("True && True es " + (true && true));
		System.out.println("");
		System.out.println("False | False es " + (false | false));
		System.out.println("True | False es " + (true | false));
		System.out.println("False | True es " + (false | true));
		System.out.println("True | True es " + (true | true));
		System.out.println("");
		//El operador || es de circuito corto, es decir que si el primero ya es true, no revisa el segundo ya que el resultado será true
		System.out.println("False || False es " + (false || false));
		System.out.println("True || False es " + (true || false));
		System.out.println("False || True es " + (false || true));
		System.out.println("True || True es " + (true || true));
		System.out.println("");
		System.out.println("!False es igual a " + !(false));
		System.out.println("!True es igual a " + !(true));
		
		
	}
}
