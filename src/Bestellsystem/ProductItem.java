package Bestellsystem;
public class ProductItem extends Item {

	private final float pricePerUnit;
	private final int amount;

	public ProductItem(String description, int amount, float pricePerUnit) {
		super(description);
		this.pricePerUnit = pricePerUnit;
		this.amount = amount;
	}

	public float getPrice() {
		return amount * pricePerUnit;
	}

	public void print() {
		System.out.println("ProductItem: Description: " + amount + " mal "
				+ getDescription() + " à " + pricePerUnit + " Price: " + getPrice());
	}

}
