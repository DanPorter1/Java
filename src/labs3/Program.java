package labs3;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		getInt("Enter Number");
//		getString("Enter String");
		lunchQueue();
	}
	
	public static int getInt(String prompt) {
		Scanner s = new Scanner(System.in);
		System.out.println(prompt);
		int amount = s.nextInt();
		return amount;
	}
	
	public static String getString(String prompt) {
		Scanner e = new Scanner(System.in);
		System.out.println(prompt);
		return e.nextLine();
	}
	
	public static void lunchQueue() {
		boolean valid = false;
		String main = "";
		
		while (!valid) {
			String main1 = getString("What main dish would you like (Fish, Burgers or Veg) ?");
			main1 = main1.trim();
			if (main1.equalsIgnoreCase("burger") || main1.equalsIgnoreCase("fish") || main1.equalsIgnoreCase("veg")) {
				valid = true;
				main = main1;
			} else {
				System.out.println("Invalid Choice");
			}
		}
		
		int potatoes = getInt("How many roast potatoes would you like ?");
		int sprouts = getInt("How many brussel sprouts would you like ?");
		System.out.println("Hello, your lunch is " + main + " with " + potatoes + " roast potatoes and " + sprouts + " brussel sprouts");
	}

}
