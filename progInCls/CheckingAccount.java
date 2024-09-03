package progInCls;

public class CheckingAccount extends BankAccount {
	
	private double overdraftLimit;
	
	
	public CheckingAccount(String accNo, double bal, double overdraftLimit) {
		super(accNo, bal);
		this.overdraftLimit = overdraftLimit;
	}
	
	@Override
	public void withdraw(double amount) {
		if(amount>=1000 && amount<=(getBal() + overdraftLimit))
		super.withdraw(amount);
	}

	@Override
	public double calculateInterest() {
		
		return 0;
	}

	@Override
	public String generateStatement() {
		return "Savings Account Statement \n"
				+ "\n Account Number : " + getAccNo()
				+ "\n Balance : " + getBal()
				+ "\n OverdraftLimit : " + overdraftLimit;
	}

}
