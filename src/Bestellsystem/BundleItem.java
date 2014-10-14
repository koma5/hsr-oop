package Bestellsystem;


public class BundleItem extends Item{
	
	private final float discount;
	private int positions;
	private Item[] items = new Item[22];
	
	public BundleItem(String description, float discount) {
		super(description);
		this.discount = discount;
		this.positions = 0;
	}
	
	public void addItem(Item... itemsToAdd) {
		for (Item i : itemsToAdd) {
			this.addItem(i);
		}
	}

	public void addItem(Item itemToAdd) {
		items[positions] = itemToAdd;
		positions++;
	}
	
	public float getPrice() {
		float total = 0;
		for (int i = 0; i < positions; i++) {
			total += items[i].getPrice();
		}
		
		return total * discount / 100;
	}
	
	public void print() {
		System.out.println("BundleItem: " + getDescription() + " " + discount + "%");
		for (int i=0; i < positions; i++) {
			items[i].print();
		}
		System.out.println("BundleItem: " + getDescription() + " Total: " + getPrice());
	}
	

}
