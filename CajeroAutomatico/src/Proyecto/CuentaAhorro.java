package Proyecto;

public class CuentaAhorro extends CuentaBancaria{

	private final double COMISION = 0.12;
	
	public CuentaAhorro(){
		super();
	}
	
	public CuentaAhorro(String titular, double saldo){
		super(titular, saldo);
	}
	
	public CuentaAhorro(String titular, TipoDeCuenta tipoCuenta, double saldo){
		super(titular, tipoCuenta, saldo);
	}
	
	@Override
	public void informarSobreCondicionesLegales() {
		System.out.println("Condiciones legales de la cuenta: ...");
		
	}
	
	@Override
	public void sacarDinero(double cantidad) {
		if(cantidad < 0) {
			return;
		}
		saldo -= cantidad;
		saldo -= COMISION;
	
	}
}
