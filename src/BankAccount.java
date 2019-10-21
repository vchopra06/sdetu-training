public class BankAccount {
	String accountNumber;
	static final String routingNumber = "125785";
	String name;
	String ssn;
	String accountType;
	double balance;
	
	BankAccount(){
		System.out.println("New Bank Account Created!");
	}
	
	BankAccount(String accountType){
		System.out.println("New account:" + accountType);
	}
	
	BankAccount(String accounttype, double initdeposit){
		System.out.print(accounttype);
		System.out.println(initdeposit);
		String msg = "";
		if(initdeposit < 1000) {
			msg = "ERROR! Minimum deposit must be at least $1000";
		}
		else {
			msg = "Thanks for your initial deposit of :$" + initdeposit;
		}
		System.out.println(msg);
		balance = balance + initdeposit;
		
	}
	
	void deposit() {
		
	}
	
	void withdraw() {
		
	}
	
	void checkBalance() {
		System.out.println("Balance: " + balance);
		
	}
	
	void getStatus() {
		
	}
	
	@override
	public String toString() {
		return "[" + name + ". " + accountNumber + ". Balance: $" + balance + "]";
	}
	
	
}
