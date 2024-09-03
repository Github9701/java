package progInCls;

public class BankMain {

	public static void main(String[] args) {
		
		BankAccount b1 = new SavingsAccount("HDFC1234",52000,0.07);
		BankAccount b2 = new SavingsAccount("HDFC5692",64000,0.09);
		BankAccount b3 = new CheckingAccount("HDFC9568213",500000,200000);
		
		b1.deposit(2000);
		b2.withdraw(2300);
		b3.deposit(100000);
		
		System.out.println(b1.generateStatement());
		System.out.println();
		System.out.println(b2.generateStatement());
		System.out.println();
		System.out.println(b3.generateStatement());
		
		

	}

}
