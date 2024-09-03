package exception;

public abstract class BankAccount{
	
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
	
	public void deposit(double amount) throws InvalidAmountException{
		if(amount>=100)
			bal += amount;
		else
		    throw new InvalidAmountException("Amount < 100");
		
	}
	
	public void withdraw(double amount) throws InsufficientFundsException {
		if(amount>=100 && amount<=bal)
			bal -= amount;
		else
			throw new InsufficientFundsException("Insuffient funds");
	}
	
	public abstract double calculateInterest();
	
	public abstract String generateStatement();

}
