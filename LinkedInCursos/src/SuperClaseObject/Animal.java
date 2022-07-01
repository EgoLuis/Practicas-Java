package SuperClaseObject;

public class Animal {
	
	private String especie;
	private int numeroDePatas;
	
	public Animal(String especie, int numeroDePatas) {
		this.especie = especie;
		this.numeroDePatas = numeroDePatas;
	}
	
	public String obtenerEspecie() {
		return especie;
	}
	
	public int ibtenerNumeroDePatas() {
		return numeroDePatas;
	}

	@Override
	public String toString() {
		return "Animal [especie=" + especie + ", numeroDePatas=" + numeroDePatas + "]";
	}
	
	

}
