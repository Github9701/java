package threads;

public class BankMain {

	public static void main(String[] args) {
		BankAccount account = new BankAccount(1000);
		
		Deposit d1 = new Deposit(account, 200);
		Deposit d2 = new Deposit(account, 450);
		Withdraw w1 = new Withdraw(account, 320);
		Withdraw w2 = new Withdraw(account, 120);
		
		
		
		d1.run();
		d2.run();
		w1.run();
		w2.run();
		
		
		System.out.println("Final Balance : " + account.getBalance());

	}

}
