package Bank;

public class BankAccountUnitTestLike {

	public static void main(String[] args) {
		
		BankManager myMamaner = new BankManager("Stevie Invety", 1);
		BankCustomer myCustomer = new BankCustomer("Marco Koch", 22, "Niederwies 18", myMamaner);
		
		long accountNummberInput = 443331;
		
		BankAccount myAccount = new BankAccount(accountNummberInput, myCustomer);
		boolean initializeBalanceToZero = myAccount.getBalance() == 0;
		boolean accountNummberIsSet = myAccount.getAccountNummber() == accountNummberInput;
		
		myAccount.deposit(10);
		myAccount.deposit(5.5);
		
		boolean balanceIsRightAfterDeposit = myAccount.getBalance() == 15.5;
		
		myAccount.widthdraw(5.5);
		myAccount.widthdraw(10);
		
		boolean balanceIsRightAfterWidthdraw = myAccount.getBalance() == 0;
		
		/*try {
			a.balance = 9;
		}
		catch NotVisibleException;
		boolean setBalanceViaVariable = ?; */
		
		if (initializeBalanceToZero &&
				accountNummberIsSet &&
		 balanceIsRightAfterDeposit &&
	   balanceIsRightAfterWidthdraw )
		{
			System.out.println("All true...");
		}
		else {
			System.out.println("Something went wrong...");
		}
		
		
		
	}

}
