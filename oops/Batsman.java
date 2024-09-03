package oops;

public class Batsman {
	private static int id = 101;
	private int batsmanId;
	private String name;
	private int runsScored,centuries,halfCenturies,ballsFaced,fours,sixes;
	public Batsman(String name, int runsScored, int centuries, int halfCenturies, int ballsFaced,
			int fours, int sixes) {
		super();
		this.batsmanId = id;
		this.name = name;
		this.runsScored = runsScored;
		this.centuries = centuries;
		this.halfCenturies = halfCenturies;
		this.ballsFaced = ballsFaced;
		this.fours = fours;
		this.sixes = sixes;
		id++;
	}
	
	public int getRunsScored() {
		return runsScored;
	}

	public void setRunsScored(int runsScored) {
		this.runsScored = runsScored;
	}

	public int getBallsFaced() {
		return ballsFaced;
	}
	public void setBallsFaced(int ballsFaced) {
		this.ballsFaced = ballsFaced;
	}
	public int getBatsmanId() {
		return batsmanId;
	}
	public String getName() {
		return name;
	}
	public int getCenturies() {
		return centuries;
	}
	public int getHalfCenturies() {
		return halfCenturies;
	}
	
	public int getFours() {
		return fours;
	}

	public void setFours(int fours) {
		this.fours = fours;
	}

	public int getSixes() {
		return sixes;
	}

	public void setSixes(int sixes) {
		this.sixes = sixes;
	}

	@Override
	public String toString() {
		return "Batsman [batsmanId=" + batsmanId + ", name=" + name + ", runsScored=" + runsScored + ", centuries="
				+ centuries + ", halfCenturies=" + halfCenturies + ", ballsFaced=" + ballsFaced + ", fours=" + fours
				+ ", sixes=" + sixes + "]";
	}
	
	

}
