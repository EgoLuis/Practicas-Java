package Videojuego;

public class Protagonista extends Personaje {
	
	private static final int UNIDADES_DE_SALTO = 10;
	private String nombre;
	
	
	public Protagonista(int posicionX, int posicionY, String nombre) {
		super(posicionX, posicionY);
		this.nombre = nombre;
	}
	
	
	public void recibirCura(int puntos) {
		puntosDeVida += puntos;
	}
	
	
	public void saltar() {
		posicionY += UNIDADES_DE_SALTO;
	}
	
	@Override
	public void emitirSonidoDeDolor() {
		System.out.println("¡Ou!");
	}

}
