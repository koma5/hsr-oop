package Bestellsystem;
import java.util.ArrayList;

public class Order {

	private ArrayList<Item> items = new ArrayList<Item>();

	public float getTotalPrice() {
		float total = 0;
		for (Item i : items) {
			total += i.getPrice();
		}
		return total;
	}

	public ArrayList<Item> getItems() {
		return this.items;
	}

	public void addItem(Item... itemsToAdd) {
		for (Item i : itemsToAdd) {
			this.addItem(i);
		}
	}

	public void addItem(Item itemToAdd) {
		items.add(itemToAdd);
	}

	public void print() {
		for (Item i : items) {
			i.print();
		}
		System.out.println("Total: " + getTotalPrice());
	}
}
