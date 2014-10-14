package Bank;

public class BankAccountTest {

	public static void main(String[] args) {
		
	
		BankManager kate = new BankManager("Kate Smith", 1);
		BankManager uwe = new BankManager("Uwe Schnell", 2);
		
		BankCustomer klara = new BankCustomer("Klara Meier", 30, "Stachelberg 1", kate);
		BankCustomer petra = new BankCustomer("Petra Müller", 28, "Im Hof 6", kate);
		
		BankCustomer hans = new BankCustomer("Hans Meier", 22, "Schwarzwiis 69", uwe);
		BankCustomer stefan = new BankCustomer("Stefan Schmid", 58, "Im Grüt 6", uwe);
		
		BankAccount[] bankAccounts = new BankAccount[5];
		
		
		bankAccounts[0] = new BankAccount(1, klara);
		bankAccounts[1] = new BankAccount(2, klara);
		bankAccounts[2] = new BankAccount(3, petra);
		bankAccounts[3] = new BankAccount(4, hans);
		bankAccounts[4] = new BankAccount(5, stefan);
		
		for (BankAccount b : bankAccounts)
		{
			b.print();
		}
		
		System.out.println("--------------sameCustomer()--------------");
		bankAccounts[0].print();
		bankAccounts[1].print();
		System.out.println("sameCustomer: " + bankAccounts[0].sameCustomer(bankAccounts[1]));
		
		
		System.out.println("--------------openNewAccount()--------------");
		
		BankAccount newOne = klara.openNewAccount(9823947);
		newOne.print();
		
	}
}
	
	

