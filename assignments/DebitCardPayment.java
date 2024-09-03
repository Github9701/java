package assignments;

public class DebitCardPayment implements Payment{
	
	int cardNo;
	double bal,amt;
	String cardHolderName;
	double availableBal;
	
	
	public DebitCardPayment(int cardNo,double bal, double amt, String cardHolderName) {
		super();
		this.cardNo = cardNo;
		this.bal = bal;
		this.amt = amt;
		this.cardHolderName = cardHolderName;
		
	}
		
	@Override
	public void paymentProcess() {
		if(amt>0 && amt<=(availableBal = bal - amt))
			System.out.println("Processing payment of " + amt);
			else
				System.out.println("card declined due to insufficient funds");
		
	}
	@Override
	public String statementGenerator() {
		return "\n Card Number : " + cardNo
				+ "\n Card Holder Name : " + cardHolderName
				+ "\n Amount Spend : " + amt
				+ "\n Available Balance : " + (availableBal = bal - amt);
	}

}
