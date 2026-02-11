package eg02;

public class Bank {

	Accounts[] accounts = new Accounts[3];
//	static int nextId = 1;
//	private int id;
//	private String name;
//	private double blanace;
	
	public Bank () {
		
	}
	
	public void addAccount(String name, double balance) {
		Accounts a = new Accounts(name, balance);
	}
}
