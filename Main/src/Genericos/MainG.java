package Genericos;

public class MainG {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ClaseGen<Integer> objetoA = new ClaseGen<Integer>(2); 
		objetoA.tipoClase();
		
		ClaseGen<String> objetoB = new ClaseGen<String>("cadena");
		objetoB.tipoClase();
		
		System.out.println(objetoA.metodoGen(" h o l a 1"));
		System.out.println(objetoB.metodoGen(10));
	}

}
