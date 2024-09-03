package assignments;

public class CreditCardPayment implements Payment {
	
	int cardNo;
	double limit,amt;
	String cardHolderName;
	double balance;
	
	
	public CreditCardPayment(int cardNo,double limit, double amt, String cardHolderName) {
		super();
		this.cardNo = cardNo;
		this.limit = limit;
		this.amt = amt;
		this.cardHolderName = cardHolderName;
		
	}
	@Override
	public void paymentProcess() {
		
		if(amt>0 && amt<=limit)
		System.out.println("Processing credit card payment of " + amt);
		else
			System.out.println("card declined");
		
		}
	
	
	@Override
	public String statementGenerator() {
		
		return "\n Card Number : " + cardNo
				+ "\n Card Holder Name : " + cardHolderName
				+ "\n CreditCard Limit : " + limit
				+ "\n Amount Spend : " + amt
				+ "\n Available Balance : " + (balance = limit - amt);
		
		
		
	}

}
