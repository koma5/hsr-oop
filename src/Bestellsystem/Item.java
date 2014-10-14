package Bestellsystem;

public abstract class Item {

	private String description;
	
	public Item(String description) {
		this.description = description;
	}
	
	public abstract float getPrice();
	
	public String getDescription() {
		return description;
	}
	
	public abstract void print();
	
}
