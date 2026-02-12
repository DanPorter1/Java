package calculatorTask;

import java.util.Scanner;

public class InputValidator {

	static Scanner s = new Scanner(System.in);


	public static double inNumber() {
		System.out.println("Enter a number");
		while (true) {
			String input = s.next();
			try {
				return Double.parseDouble(input.trim());
			} catch (NumberFormatException e) {
				System.out.println("Invalid input. Please enter a number.");
			}
		}
	}
	
	public static String inOpp() {
		System.out.println("Enter opperator");
		String input = s.next();
		String opp = null;
		boolean valid = true;
		while (valid) {
			switch (input) {
				case "+": {
					opp = "+";
					valid = false;
				}
				case "-": {
					opp = "-";
					valid = false;
				}
				case "*" -> opp = "*";
				case "/" -> opp = "/";
				default -> System.out.println("Invalid opperator");
			};
		return opp;
		}
	}
}