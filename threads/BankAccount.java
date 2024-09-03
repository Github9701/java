package threads;

public class BankAccount {
	
	private double balance;

	public BankAccount(double initialBalance) {
		super();
		this.balance = initialBalance;
	}
	
	public synchronized void deposit(double amount) {
		
		balance += amount;
		System.out.println(Thread.currentThread().getName() + " deposited " + amount + ". New Balance : " + balance);
	}
	
	public synchronized void withdraw(double amount) {
		
		if(balance >= amount) {
			
			balance -= amount;
			System.out.println(Thread.currentThread().getName() + " withdrew " + amount + ". New Balance : " + balance);
			
		}else {
			
			System.out.println(Thread.currentThread().getName() + " attempted to withdraw " + amount + "but only " + balance + " is available.");
		}
	}
	
	public double getBalance() {
		return balance;
	}
	
}
