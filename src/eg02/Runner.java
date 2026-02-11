package eg02;

import java.util.Scanner;

import scanner.ScannerService;

public class Runner {

	public static void main(String[] args) {
		Accounts dan = new Accounts("Daniel", 100);
		Accounts test = new Accounts("Test", 1);
		System.out.println(dan);
		System.out.println(test);
		System.out.println("\n");
		ScannerService s = new ScannerService();
//		dan.deposit(s.getInt("Enter amount to deposit"));
//		dan.withdraw(s.getInt("Enter amout to withdraw"));
//		System.out.println(dan);
		
		Accounts[] accounts = new Accounts[3];
		accounts[0] = new Accounts("Bob", 100);
		accounts[1] = new Accounts("Jimmy", 50);
		accounts[2] = new Accounts("Bart", 200);

//		for (Accounts acc : accounts) {
//			System.out.println(acc);
//			acc.deposit(100);
//		}
		
		
//		dan.deposit(100);
//		dan.withdraw(300);
		
//		Accounts myAccount = new Accounts("myAccount", 100);
//		System.out.println(myAccount);
//		myAccount.addIntrest();
//		System.out.println(myAccount);
//		myAccount.addIntrest();
//		System.out.println(myAccount);
		
//		processAccount(myAccount);
//		System.out.println(myAccount);
//		
//		int k=100;
//		incInt(k);
//		System.out.println(k);
		
		Bank bank = new Bank();
		bank.addAccount("Tom", 1000);
		
	}
	
	static void processAccount(Accounts acc) {
		acc.addIntrest();
	}
	
	private static void incInt(int x) {
		x++;
	}
}
