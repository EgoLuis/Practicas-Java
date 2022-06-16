package uso_threads;

public class SincronizandoHilos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		HilosVarios hilo1 = new HilosVarios();
		HilosVarios hilo2 = new HilosVarios();
		
		hilo1.start();
		
		try {
			hilo1.join(); //este método hace que no pueda ejecutarse otro hilo hasta que termine este
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
		hilo2.start();
		
		try {
			hilo2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		
		HilosVarios hilo1 = new HilosVarios();
		HilosVarios2 hilo2 = new HilosVarios2(hilo1);
		
		hilo2.start();
		hilo1.start();
		
		System.out.println("Terminadas las tareas"); //el hilo del main queda liberado de la sincronización de hilos

	}

}

class HilosVarios extends Thread{
	
	public void run() {
		for(int i=0; i<15;i++) {
			System.out.println("Ejecutando Hilo " + getName());
			try {
				Thread.sleep(700);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

class HilosVarios2 extends Thread{ //en esta clase automatizamos que un hilo no pueda comenzar hasa que termine al que le pasamos por parámetro
	
	public HilosVarios2(Thread hilo) {
		this.hilo = hilo;
	}
	
	public void run() {
		
		try {
			hilo.join();
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		for(int i=0; i<15;i++) {
			System.out.println("Ejecutando Hilo " + getName());
			try {
				Thread.sleep(700);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	private Thread hilo;
}