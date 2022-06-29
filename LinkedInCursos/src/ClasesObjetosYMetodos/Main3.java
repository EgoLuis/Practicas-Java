package ClasesObjetosYMetodos;
public class Main3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CuentaBancaria cuentaAna = new CuentaBancaria("Ana García", TipoDeCuenta.INFANTIL, 23_500);
		
		Informador informador = new Informador();
		
		informador.mostrarPorPantalla(3);
		informador.mostrarPorPantalla(5.3);
		informador.mostrarPorPantalla("hola");
		

	}

}
