package MultithreadExampleLinkedIn;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//CUATRO MANERAS DE INICIAR HILOS
		
		ThreadExample thread1 = new ThreadExample();
		thread1.setName("My first thread");
		thread1.start();
		
		ThreadExample thread2 = new ThreadExample();
		thread2.setName("My second thread");
		thread2.start();
		
		Thread thread3 = new Thread(new RunnableExample());
		thread3.setName("My thrid thread");
		thread3.start();
		
		Thread thread4 = new Thread(new Runnable() {
			@Override
			public void run() {
				int i = 1;
				while(i <=100) {
					System.out.println(i + " " + Thread.currentThread().getName());
					i++;
				}
			}
		});
		thread4.setName("My fourth thread");
		thread4.start();
		
		
		Thread thread5 = new Thread(() -> {			
			int i = 1;		
			while(i <=100) {				
				System.out.println(i + " " + Thread.currentThread().getName());				
				i++;
			}
			
		});
		thread5.setName("My fifth thread");
		thread5.start();
		
		
	}
}
