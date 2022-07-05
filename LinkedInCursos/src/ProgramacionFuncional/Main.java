package ProgramacionFuncional;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//GreetingMessage es una interfaz funcional, lo que hace que cada que instanciemos un objeto tengamos que definir el �nico m�todo que tiene
		GreetingMessage gm = new GreetingMessage() {
			@Override
			public void greet(String name) {
				System.out.println("Hello " + name);
			}
		};
		gm.greet("Luis");
		
		
		//La anotaci�n -> (lambda) nos permite implementar el m�todo de una forma m�s eficiente
		GreetingMessage gm2 = (String name) -> {
			System.out.println("Hello " + name);
		};
		gm2.greet("Juan");
		
		
		MessagePrinter mp = () -> {
			System.out.println("This is a message");
		};
		mp.printMessage();
		

	}
}
