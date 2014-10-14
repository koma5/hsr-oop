package Bank;

public class BankAccount {
	
	public BankAccount(long accountNummber, BankCustomer customer) {
		this.accountNummber = accountNummber;
		this.balance = 0;
		this.customer = customer;
	}
	
	private double balance;
	private long accountNummber;
	
	private BankCustomer customer;
	
	public double getBalance() { return balance; }
	public long getAccountNummber() { return accountNummber; }
	public BankCustomer getCustomer() { return customer; }
	public BankManager  getManager() { return customer.getBankManager(); }
	
	public double deposit(double amount) {
		balance += amount;
		return getBalance();
	}
	
	
	public boolean widthdraw(double amount) {
		if (amount <= balance) {
			balance -= amount;
			return true;
		}
		else {
			return false;
		}	
	}
	
	
	public void print() {
		System.out.println("Account: " + "\n" +
				"AccountNummber: " + accountNummber + "\n" +
				"Balance: "        + balance);
		customer.print();
	}
	
	public boolean sameCustomer(BankAccount other) {
		if (other.getCustomer() == customer) { return true; }
		else { return false; }
	}
}
