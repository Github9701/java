package exception;

public class BankMain {

	public static void main(String[] args) {
		
		BankAccount b1 = new SavingsAccount("HDFC1234",52000,0.07);
		BankAccount b2 = new SavingsAccount("HDFC5692",64000,0.09);
		BankAccount b3 = new CheckingAccount("HDFC9568213",500000,200000);
		try {
		b1.deposit(90);
		}catch(InvalidAmountException e) {
			System.out.println(e.getMessage());
		}
		try {
		b2.withdraw(70000);
		} catch (InsufficientFundsException e) {
			System.out.println(e.getMessage());
		}
		try {
		b3.deposit(100000);
		}catch(InvalidAmountException e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println(b1.generateStatement());
		System.out.println();
		System.out.println(b2.generateStatement());
		System.out.println();
		System.out.println(b3.generateStatement());
		
		

	}

}
