package ClasesAbstractasInterfaces;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Triangulo tr1 = new Triangulo(12,5,13);
		
		System.out.println(tr1.obtenerArea());
		System.out.println(tr1.obtenerPerimetro());
		
		var repVideo = new ReproductorDeVideo();
		var repMP3 = new ReproductorDeMP3();
		
		repVideo.adelantar();
		repMP3.adelantar();

	}

}
