package Bestellsystem;
public class Test {

	public static void main(String[] args) {

		ServiceItem item = new ServiceItem("Mittagessen", 5.5f);
		ProductItem item2 = new ProductItem("Mighty Mouse", 3, 99.9f);
		ProductItem item3 = new ProductItem("Gipfeli", 14, 3.6f);

		// item.print();
		// item2.print();

		Order myOrder = new Order();
		myOrder.addItem(item, item2);

		myOrder.print();

		myOrder.addItem(item3);
		myOrder.print();

		BundleItem myBundle = new BundleItem("my super awesome bundle", 15.3f);
		
		BundleItem humbleBundle = new BundleItem("Humblebundle", 42.4f);
		ServiceItem item4 = new ServiceItem("Intimrasur", 5.5f);
		ServiceItem item5 = new ServiceItem("Auftragsmord", 55.5f);
		humbleBundle.addItem(item4, item5);
		
		ProductItem item6 = new ProductItem("Monitor", 2, 50);
		ProductItem item7 = new ProductItem("Tastatur", 2, 50);
		
		myBundle.addItem(humbleBundle, item6, item7);
		
		System.out.println("---------");
		
		myOrder.addItem(myBundle);
		
		myOrder.print();

	}

}
