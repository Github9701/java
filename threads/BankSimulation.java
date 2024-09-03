package threads;

public class BankSimulation {

	public static void main(String[] args) {
		
		BankAccount account = new BankAccount(1000);
		
		DepositThread d1 = new DepositThread(account, 200);
		DepositThread d2 = new DepositThread(account, 300);
		WithdrawThread w1 = new WithdrawThread(account, 150);
		WithdrawThread w2 = new WithdrawThread(account, 500);
		
		d1.setName("DepositThread-1 ");
		d2.setName("DepositThread-2 ");
		w1.setName("WithdrawThread-1 ");
		w2.setName("WithdrawThread-2 ");
		
		d1.start();
		d2.start();
		w1.start();
		w2.start();
		
		try {
			d1.join();
			d2.join();
			w1.join();
			w2.join();
		}catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("Final balance : " + account.getBalance());

	}

}
