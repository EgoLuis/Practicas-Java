package ClasesObjetosYMetodos;

public class PasoPorReferencia {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int var1 = 23;
		int var2 = var1;
		
		System.out.println("El valor de var1 es " + var1);
		System.out.println("El valor de var2 es " + var2);
		
		var2 = 78;
		
		System.out.println("El valor de var1 es " + var1);
		System.out.println("El valor de var2 es " + var2);

		CuentaBancaria cuentaDeJuan = new CuentaBancaria();
		cuentaDeJuan.saldo = 23_500;
		
		CuentaBancaria cuentaDeAna = cuentaDeJuan;
		cuentaDeAna.saldo = 10_000;
		
		//Al crear la cuenta de Ana no se hizo una nueva asignacion, por lo que tanto la de Juan y Ana apuntan al mismo objeto y cada modificacion afecta a ambos
		System.out.println("Saldo Juan: " + cuentaDeJuan.saldo);
		System.out.println("Saldo Ana: " + cuentaDeAna.saldo);
		
		
	}

}
