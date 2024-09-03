package oops;

public class Espncricinfo {
    
	private final static int SIZE = 11;
    private Batsman batsmen[] = new Batsman[SIZE];
	private int noOfBatsmen = 0;
	
	public Batsman[] getBatsmen() {
		return batsmen;
	}
	
	public int getNoOfBatsmen() {
		return noOfBatsmen;
	}
	
	
	public int addBatsman(String name, int runsScored, int centuries, int halfCenturies, int ballsFaced, int fours,
			int sixes) {
		
		Batsman b1 = new Batsman(name,runsScored,centuries,halfCenturies,ballsFaced,fours,sixes);
		batsmen[noOfBatsmen] = b1;
		noOfBatsmen++;
		return b1.getBatsmanId();
				
	}

	public Batsman updateBatsmanStats(int id, int runsScored, int ballsFaced, int fours, int sixes) {
	return null;	
	}
	public Batsman getBatsman(int batsmanId) {
		for(int i=0;i<noOfBatsmen;i++)
			if(batsmen[i].getBatsmanId()==batsmanId)
				return batsmen[i];
				
		return null;
	}
	
	
	
	
}

	
