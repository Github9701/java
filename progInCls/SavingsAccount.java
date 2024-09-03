package progInCls;

public class SavingsAccount extends BankAccount {
	
	private double interestRate;
	
	public SavingsAccount(String accNo, double bal, double interestRate) {
		super(accNo, bal);
		this.interestRate = interestRate;
	}

	@Override
	public double calculateInterest() {
		return getBal()*interestRate;
	}

	@Override
	public String generateStatement() {
		return "Savings Account Statement \n"
				+ "\n Account Number : " + getAccNo()
				+ "\n Balance : " + getBal()
				+"\n Earned Interst : " + calculateInterest();
	}

}
