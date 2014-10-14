package Bank;

public class BankCustomer {
	private String name;
	private int age;
	private String address;
	
	private BankManager manager;
	
	public BankCustomer(String name, int age,  String address, BankManager manager) {
		this.name = name;
		this.age = age;
		this.address = address;
		this.manager = manager;
		
	}

	public BankManager getBankManager() { return manager; }
	
	public void print() {
		System.out.println("Customer: " + "\n" +
				"Name: "    + name    + "\n" +
				"Age: "     + age     + "\n" +
				"Address: " + address);
		manager.print();
	}
	

	public BankAccount openNewAccount(long accountNummber) {
		return new BankAccount(accountNummber, this);
	}
	
}
