package oops;

public class BatsmanInfo {
	
	private int id;
	private static int idGenerator = 100000;
	private String batsman;
	
	public BatsmanInfo(String batsman) {
		
		id = idGenerator;
		this.batsman = batsman;
		++idGenerator;
	}

	public String getBatsman() {
		return batsman;
	}

	public void setBatsman(String batsman) {
		this.batsman = batsman;
	}

	public int getId() {
		return id;
	}

	@Override
	public String toString() {
		return "Batsman [id=" + id + ", batsman=" + batsman + "]";
	}
	
	
	
	
	
	
	

}
