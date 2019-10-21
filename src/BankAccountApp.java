
public class BankAccountApp {

	public static void main(String[] args) {
		
		BankAccount acc1 = new BankAccount();
		acc1.accountNumber = "1548458";
		acc1.name = "Varun";
		acc1.balance = 10000;
		System.out.println(acc1.toString());
		
		/*BankAccount acc2 = new BankAccount("checking");
		BankAccount acc3 = new BankAccount("Savings Account", 5000);
		acc3.checkBalance();
		*/

	}

}
