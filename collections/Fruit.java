package collections;

public class Fruit {
	
	private String name;
	private int count;
	
	public Fruit(String name) {
		super();
		this.name = name;
		count = 1;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCount() {
		return count;
	}

	

	@Override
	public String toString() {
		return "Fruit [name=" + name + ", count=" + count + "]";
	}
	
	
	
	

}
