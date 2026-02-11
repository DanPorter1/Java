package eg02;

public class Accounts {

	private static int nextId = 1;
	private int id;
	private String owner;
	private double balance;
	
	public Accounts(String owner, double balance) {
		this.id = nextId++;
		this.owner = owner;
		this.balance = balance;
		System.out.println("Account Created");
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
		if (this.balance >= amount) {
			this.balance -= amount;
			System.out.println(String.format("%s has withdrawn £%.2f: Current balance: £%.2f", owner, amount, balance));
		}
		else {
			System.out.println(String.format("You do not have enough to withdraw £%.2f - Current balance is £%.2f", amount, this.balance));
		}
	}
	
	public void changeName(String name) {
		String message = String.format("Account for %s: has now been updated with the new name %s", this.owner, name);
		this.owner = name;
		System.out.println(message);
	}
	
	public void addIntrest() {
		double intrest = 0.025;
		this.balance += (this.balance * intrest);
	}
	
}

