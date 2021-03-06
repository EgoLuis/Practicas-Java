package uso_threads;

import java.util.concurrent.locks.*;


public class BancoSinSincronizar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Banco b = new Banco();
		for(int i=0; i<100; i++) {
			EjecucionTransferencias r = new EjecucionTransferencias(b,i,2000);
			Thread t = new Thread(r);
			t.start();
		}
	}

}

class Banco{
	
	public Banco() {		
		cuentas= new double[100];
		for(int i=0; i<cuentas.length; i++) {
			cuentas[i] = 2000;
		}
		//saldoSuficiente = cierreBanco.newCondition(); //Aqui estamos a?adiendo un bloqueo pero con condici?n
	}
	
	
	public synchronized void transferencia(int cuentaOrigen, int cuentaDestino, double cantidad) throws InterruptedException{ //con synchronized nos evitamos el uso de un objeto de tipo Condition
		
		//cierreBanco.lock();//con este m?odo bloqueamos la ejecuci?n de otro hilo, hasta que termine este
		
		
		//try {
			while(cuentas[cuentaOrigen] < cantidad) { //evalua que el saldo no es inferior a la transferencia
				//return;
				//saldoSuficiente.await(); //El hilo permanecera en espera mientras se siga cumpliendo la conidicion del while, de esta forma un hilo nunca muere solamente queda a la espera hasta que cumpla la condici?n
				wait(); //este m?todo se puede usar gracias a synchroniez, misma funci?n que await()
			}
			
			System.out.println(Thread.currentThread());
			cuentas[cuentaOrigen]-=cantidad; //dinero que sale de la cuenta origen
			System.out.printf("%10.2f de %d para %d", cantidad, cuentaOrigen, cuentaDestino);
			cuentas[cuentaDestino]+=cantidad; //dinero que entra a la cuenta destino			
			System.out.printf(" Saldo total: %10.2f%n", getSaldoTotal()); //total de las cuentas
			//saldoSuficiente.signalAll(); //con este m?todo se despiertan todos los hilos que estan a la espera
			notifyAll(); //este m?todo se puede usar gracias a synchroniez, misma funci?n que signalAll()
		//}finally {
			//cierreBanco.unlock();
		//}
	}
	
	
	public double getSaldoTotal() {
		double suma_cuentas = 0;
		for (double a: cuentas) {
			suma_cuentas+=a;
		}
		return suma_cuentas;
	}
	
	private final double[] cuentas;
	//private Lock cierreBanco = new ReentrantLock();  //la ventaja de ReentrantLock sobre synchronized es que podemos poner varias condiciones
	//private Condition saldoSuficiente;
}

class EjecucionTransferencias implements Runnable{

	public EjecucionTransferencias(Banco b, int de, double max) {
		banco = b;
		deLaCuenta = de;
		cantidadMax = max;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {
		while(true) {
			int paraLaCuenta = (int)(100*Math.random());
			double cantidad = cantidadMax*Math.random();
			banco.transferencia(deLaCuenta, paraLaCuenta, cantidad);
			Thread.sleep((int)(Math.random()*10));
			}
		} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	
	private Banco banco;
	private int deLaCuenta;
	private double cantidadMax;
}
