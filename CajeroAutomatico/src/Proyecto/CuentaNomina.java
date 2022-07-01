package Proyecto;

public class CuentaNomina extends CuentaBancaria {

	public CuentaNomina(){
		super();
	}
	
	public CuentaNomina(String titular, double saldo){
		super(titular, saldo);
	}
	
	public CuentaNomina(String titular, TipoDeCuenta tipoCuenta, double saldo){
		super(titular, tipoCuenta, saldo);
	}
	
	@Override
	public void informarSobreCondicionesLegales() {
		System.out.println("Condiciones legales de la cuenta: ...");
		
	}
	
}
