package ClasesObjetosYMetodos;

public class CuentaBancaria {
	
	String titular;
	TipoDeCuenta tipoCuenta;
	double saldo;
	
	public static final String TIPO_AHORRO = "ahorro";
	public static final String TIPO_NOMINA = "nómina";
	
	
	
	final double COMISION = 1.2;
	
	CuentaBancaria(){
		this("", TipoDeCuenta.AHORRO, 0);
	}
	
	CuentaBancaria(String titular, double saldo){
		this(titular, TipoDeCuenta.AHORRO, saldo);
	}
	
	CuentaBancaria(String titular, TipoDeCuenta tipoCuenta, double saldo){
		this.titular = titular;
		this.tipoCuenta = tipoCuenta;
		this.saldo = saldo;
	}
	
	void sacarDinero(double cantidad) {
		if(cantidad < 0) {
			return;
		}
		
		double comision = 0.0;
		if(tipoCuenta.equals(tipoCuenta.AHORRO)) {
			comision = COMISION;
		}
		
		saldo -= cantidad;
		saldo -= comision;
	}
	
	void ingresarDinero(double cantidad) {
		saldo += cantidad;
	}
	
	double calcularComision() {
		switch(tipoCuenta) {
		case AHORRO:
			return COMISION;
		case NOMINA:
			return 0;
		default:
			return 0;
		}
	}
	
	
	void cambiarTipoCuenta(TipoDeCuenta nuevoTipo) {
		tipoCuenta = nuevoTipo;
	}
	
	
	double obtenerSaldo() {
		return saldo;
	}

}
