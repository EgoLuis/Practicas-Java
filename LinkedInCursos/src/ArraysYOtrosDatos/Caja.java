package ArraysYOtrosDatos;

public class Caja<T> {
	
	T elemento;
	
	Caja(T elemento){
		this.elemento = elemento;
	}
	
	T obtenerObjeto() {
		return elemento;
	}
	
	<V> boolean perteneceElContendioALaMismaClase(V otroObjeto) {
		return elemento.getClass() == otroObjeto.getClass();
	}

}
