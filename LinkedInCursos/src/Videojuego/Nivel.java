package Videojuego;

public class Nivel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Personaje enemigo = new Personaje(10,0);
		
		Protagonista protagonista = new Protagonista(0, 0, "Cecilia");
		
		enemigo.emitirSonidoDeDolor();
		
		protagonista.emitirSonidoDeDolor();
		
	}

}
