package oops;

public class Account {
	
	private int accNo;
	private String ahName;
	private String accType;
	private int curBal;
	
	public Account(int accNo, String ahName, String accType, int curBal) {
		super();
		this.accNo = accNo;
		this.ahName = ahName;
		this.accType = accType;
		this.curBal = curBal;
	}
	public String getAhName() {
		return ahName;
	}
	public void setAhName(String ahName) {
		this.ahName = ahName;
	}
	public String getAccType() {
		return accType;
	}
	public void setAccType(String accType) {
		this.accType = accType;
	}
	public int getAccNo() {
		return accNo;
	}
	public int getCurBal() {
		return curBal;
	}
	public void deposit(int amt) {
		if(amt>=100)
			curBal = curBal + amt;
		else
			System.out.println("amount should be 100 or above");
	}
	public void withdrawl(int amt) {
		if(curBal - amt>=100)
			curBal = curBal - amt;
		else
			System.out.println("you should maintain minimum bal 500");
	}
	@Override
	public String toString() {
		return "Account [accNo=" + accNo + ", ahName=" + ahName + ", accType=" + accType + ", curBal=" + curBal + "]";
	}

  
}
