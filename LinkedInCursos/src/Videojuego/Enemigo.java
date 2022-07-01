package Videojuego;

public class Enemigo extends Personaje{
	
	private static final int PUNTOS_DE_DANO = 10; 

	public Enemigo(int posicionX, int posicionY) {
		super(posicionX, posicionY);
	}
	
	public int obtenerPuntosDeDano() {
		return PUNTOS_DE_DANO;
	}
	
	public void emitirSonidoFuria() {
		System.out.println("grrrrr");
	}

}
