package threads;

public class Deposit implements Runnable {
	
	private BankAccount account;
	private double amount;
	
	

	public Deposit(BankAccount account, double amount) {
		super();
		this.account = account;
		this.amount = amount;
	}



	@Override
	public void run() {
		account.deposit(amount);

	}

}
