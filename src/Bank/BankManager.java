package Bank;
public class BankManager {
	private String name;
	private int id;
	
	public BankManager(String name, int id) {
		this.name = name;
		this.id = id;
	}
	
	public void print() {
		System.out.println("Manager: " + "\n" +
				"Name: " + name + "\n" +
				"id: "   + id   + "\n");
	}

	
}
