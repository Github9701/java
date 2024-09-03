package assignments;

public class PaymentMain {

	public static void main(String[] args) {
		Payment p1 = new CreditCardPayment(256398, 65000, 21000, "Jayaram");
		Payment p2 = new DebitCardPayment(124589,25000, 2300, "Suresh");
		
		p1.paymentProcess();
		
		System.out.println(p1.statementGenerator());
		System.out.println();
		
		p2.paymentProcess();
		
		System.out.println(p2.statementGenerator());

	}

}
