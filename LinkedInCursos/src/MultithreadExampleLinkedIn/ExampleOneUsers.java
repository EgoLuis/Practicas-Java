package MultithreadExampleLinkedIn;

public class ExampleOneUsers {
	
	static final ExampleOneBankAccount account = new ExampleOneBankAccount(50);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		account.topUp(100);
		
		Thread t1 = new Thread(() ->{
			ExampleOneATM.withdraw(account, 100);
		});
		
		Thread t2 = new Thread(() ->{
			ExampleOneATM.withdraw(account, 100);
		});
		
		t1.start();
		t2.start();
		
		//ATM tiene un metodo sincronizado por lo que no puede empezar un hilo sin terminar el anterior

	}

}
