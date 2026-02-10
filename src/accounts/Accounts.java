package accounts;

public class Accounts {

	private int id;
	private String owner;
	private double balance;
	
	public Accounts(int id, String owner, double balance) {
		super();
		this.id = id;
		this.owner = owner;
		this.balance = balance;
	}
	

	@Override
	public String toString() {
		return String.format("%d - Account for %s: Current balance £%.2f", id, owner, balance);
//		return "Accounts [id=" + id + ", owner=" + owner + ", balance=" + balance + "]";
	}

	public void deposit(double amount) {
		this.balance += amount;
		System.out.println(String.format("%s deposted £%.2f: Current balance: £%.2f", owner, amount, balance));
	}
	
	public void withdraw(double amount) {
		this.balance -= amount;
		System.out.println(String.format("%s has withdrawn £%.2f: Current balance: £%.2f", owner, amount, balance));
	}
	
	public void changeName(String name) {
		String message = String.format("Account for %s: has now been updated with the new name %s", this.owner, name);
		this.owner = name;
		System.out.println(message);
	}
}
