package Bestellsystem;
public class ServiceItem extends Item {

	private final float price;

	public ServiceItem(String description, float price) {
		super(description);
		this.price = price;
	}

	public float getPrice() {
		return price;
	}

	public void print() {
		System.out.println("ServiceItem: Description: " + getDescription()
				+ " Price: " + getPrice());
	}

}
