package Proyecto;

public abstract class CuentaBancaria {
	
	private String titular;
	private TipoDeCuenta tipoCuenta;
	protected double saldo;
	
	public static final String TIPO_AHORRO = "ahorro";
	public static final String TIPO_NOMINA = "nómina";
	
	private final double COMISION = 1.2;
	
	public CuentaBancaria(){
		this("", TipoDeCuenta.AHORRO, 0);
	}
	
	public CuentaBancaria(String titular, double saldo){
		this(titular, TipoDeCuenta.AHORRO, saldo);
	}
	
	public CuentaBancaria(String titular, TipoDeCuenta tipoCuenta, double saldo){
		this.titular = titular;
		this.tipoCuenta = tipoCuenta;
		this.saldo = saldo;
	}
	
	public void sacarDinero(double cantidad) {
		if(cantidad < 0) {
			return;
		}
		saldo -= cantidad;
	
	}
	
	public void ingresarDinero(double cantidad) {
		saldo += cantidad;
	}
	
	
	public void cambiarTipoCuenta(TipoDeCuenta nuevoTipo) {
		tipoCuenta = nuevoTipo;
	}
	
	
	public double obtenerSaldo() {
		return saldo;
	}
	
	public abstract void informarSobreCondicionesLegales();

}
