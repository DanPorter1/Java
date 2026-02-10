package main;

import accounts.Accounts;

public class RunnerAccount {

	public static void main(String[] args) {
		Accounts dan = new Accounts(1, "Daniel", 100.56);
		Accounts tom = new Accounts(2, "Tom", 200.56);
		dan.deposit(1000);
		dan.withdraw(0.56);
		dan.changeName("Sam");
		
		tom.deposit(50000);
		tom.withdraw(10.99);
		System.out.println(dan);
		System.out.println(tom);
		
	}

}
