package Videojuego;

public class Dragon extends Enemigo{
	
	private static final int PUNTOS_DE_DANO = 80;

	public Dragon(int posicionX, int posicionY) {
		super(posicionX, posicionY);
	}
	
	public int obtenerPuntosDeDano() {
		return PUNTOS_DE_DANO;
	}

}
