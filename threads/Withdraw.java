package threads;

public class Withdraw implements Runnable {
	
	private BankAccount account;
	private double amount;
	
	

	public Withdraw(BankAccount account, double amount) {
		super();
		this.account = account;
		this.amount = amount;
	}



	@Override
	public void run() {
		account.withdraw(amount);

	}

}
