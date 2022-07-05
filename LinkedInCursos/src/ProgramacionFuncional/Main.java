package ProgramacionFuncional;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//GreetingMessage es una interfaz funcional, lo que hace que cada que instanciemos un objeto tengamos que definir el único método que tiene
		GreetingMessage gm = new GreetingMessage() {
			@Override
			public void greet(String name) {
				System.out.println("Hello " + name);
			}
		};
		gm.greet("Luis");
		
		
		//La anotación -> (lambda) nos permite implementar el método de una forma más eficiente
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
