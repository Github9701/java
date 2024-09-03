package progInCls;

public abstract class BankAccount {
	
	private String accNo;
	private double bal;
	public BankAccount(String accNo, double bal) {
		super();
		this.accNo = accNo;
		this.bal = bal;
	}
	public double getBal() {
		return bal;
	}
	
	public String getAccNo() {
		return accNo;
	}
	
	public void deposit(double amount) {
		if(amount>=100)
			bal += amount;
	}
	
	public void withdraw(double amount) {
		if(amount>=100 && amount<=bal)
			bal -= amount;
	}
	
	public abstract double calculateInterest();
	
	public abstract String generateStatement();

}
