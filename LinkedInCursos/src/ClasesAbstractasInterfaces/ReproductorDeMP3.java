package ClasesAbstractasInterfaces;

public class ReproductorDeMP3 implements Reproductor {

	@Override
	public void reproducir() {
		System.out.println("Reproduciendo audio");
	}

	@Override
	public void pausar() {
		System.out.println("Video audio");
		
	}

	@Override
	public void parar() {
		System.out.println("Video audio");
		
	}

	
	public void rebobinar() {
		System.out.println("Rebobinando audio");
		
	}

	@Override
	public void adelantar() {
		System.out.println("Adelantando audio");
		
	}


}
