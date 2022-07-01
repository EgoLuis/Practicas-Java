package ClasesAbstractasInterfaces;

public class ReproductorDeVideo implements Reproductor {

	@Override
	public void reproducir() {
		System.out.println("Reproduciendo video");
	}

	@Override
	public void pausar() {
		System.out.println("Video pausado");
		
	}

	@Override
	public void parar() {
		System.out.println("Video parado");
		
	}

	
	public void rebobinar() {
		System.out.println("Rebobinando video");
		
	}

	@Override
	public void adelantar() {
		System.out.println("Adelantando video");
		
	}

	

}
