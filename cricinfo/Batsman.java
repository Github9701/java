package cricinfo;

public class Batsman {
	private static int id = 101;
	private int batsmanId;
	private String name;
	private int centuries,halfCenturies,runsScored;
	public Batsman(int batsmanId, String name, int centuries, int halfCenturies, int runsScored) {
		super();
		this.batsmanId = id;
		this.name = name;
		this.centuries = centuries;
		this.halfCenturies = halfCenturies;
		this.runsScored = runsScored;
		id++;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getCenturies() {
		return centuries;
	}
	public void setCenturies(int centuries) {
		this.centuries = centuries;
	}
	public int getHalfCenturies() {
		return halfCenturies;
	}
	public void setHalfCenturies(int halfCenturies) {
		this.halfCenturies = halfCenturies;
	}
	public int getRunsScored() {
		return runsScored;
	}
	public void setRunsScored(int runsScored) {
		this.runsScored = runsScored;
	}
	public int getBatsmanId() {
		return batsmanId;
	}
	@Override
	public String toString() {
		return "Batsman [batsmanId=" + batsmanId + ", name=" + name + ", centuries=" + centuries + ", halfCenturies="
				+ halfCenturies + ", runsScored=" + runsScored + "]";
	}
	
	

}
