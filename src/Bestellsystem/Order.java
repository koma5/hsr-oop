package Bestellsystem;

public class Order {

	private Item[] items = new Item[22];
	private int positions;
	
	public Order()
	{
		positions = 0;
	}

	public float getTotalPrice() {
		float total = 0;
		for (int i = 0; i < positions; i++) {
			total += items[i].getPrice();
		}
		return total;
	}

	public Item[] getItems() {
		return this.items;
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

	public void print() {
		for (int i = 0; i < positions; i++) {
			items[i].print();
		}
		System.out.println("Total: " + getTotalPrice());
	}
}
