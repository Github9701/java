package assignments;

public class Fruit {
	
	String name;
	int count;

	public Fruit(String name) {
		this.name = name;
		count = 1;
	}

	public String toString() {
		return name + ":" + count;
	}


}
