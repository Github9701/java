package cricinfo;

public class EspnCricInfo {
	private static final int SIZE = 50;
	private Batsman batsmen[] = new Batsman[SIZE];
	private int noOfBatsmen = 0;
	
	public Batsman[] getBatsmen() {
		return batsmen;
	}
	public int getNoOfBatsmen() {
		return noOfBatsmen;
	}
	public int addBatsmen(String name,int runsScored,int centuries,int halfCenturies) {
		Batsman b = new Batsman(halfCenturies, name, centuries, halfCenturies, runsScored);
		batsmen[noOfBatsmen] = b;
		noOfBatsmen++;
		return b.getBatsmanId();
	}
	public Batsman updateBatsmanStats(int batsmanId,int centuries,int halfCenturies,int runsScored) {
		Batsman batsman = getBatsman(batsmanId);
		
		if(batsman!=null) {
			batsman.setRunsScored(runsScored);
			batsman.setCenturies(centuries);
			batsman.setHalfCenturies(halfCenturies);
			return batsman;
		}
		
		
		return null;
		
	}
	public Batsman getBatsman(int batsmanId) {
		for(int i = 0;i<noOfBatsmen;i++)
			if(batsmen[i].getBatsmanId()==batsmanId)
				return batsmen[i];
		
		return null;
	}
	
	

}
