package Bestellsystem;
import java.util.ArrayList;


public class BundleItem extends Item{
	
	private final float discount;
	private ArrayList<Item> items = new ArrayList<Item>();
	
	public BundleItem(String description, float discount) {
		super(description);
		this.discount = discount;
	}
	
	public void addItem(Item... itemsToAdd) {
		for (Item i : itemsToAdd) {
			this.addItem(i);
		}
	}

	public void addItem(Item itemToAdd) {
		items.add(itemToAdd);
	}
	
	public float getPrice() {
		float total = 0;
		for (Item i : items) {
			total += i.getPrice();
		}
		
		return total * discount / 100;
	}
	
	public void print() {
		System.out.println("BundleItem: " + getDescription() + " " + discount + "%");
		for (Item i : items) {
			i.print();
		}
		System.out.println("BundleItem: " + getDescription() + " Total: " + getPrice());
	}
	

}
