package scanner;

import java.util.Scanner;

public class ScannerService {

    private final Scanner scanner;

    public ScannerService() {
        scanner = new Scanner(System.in);
    }

    public void closeScanner() {
        scanner.close();
    }

    public String getString(String prompt) {
    	System.out.println(prompt);
        while (true) {
            String input = scanner.nextLine();

            if (input.trim().isEmpty()) {
                System.out.println("Input cannot be blank.");
            } else {
                return input;
            }
        }
    }

    public int getInt(String prompt) {
    	System.out.println(prompt);
        while (true) {
            String input = scanner.nextLine();

            try {
            	return Integer.parseInt(input.trim());
            } catch (NumberFormatException e) {
                System.out.println("Please enter a valid integer.");
            }
        }
    }
    
    public int getPInt(String prompt) {
    	System.out.println(prompt);
        while (true) {
            String input = scanner.nextLine();

            try {
            	if (Integer.parseInt(input) > 0) {
            		return Integer.parseInt(input.trim());
            	}
            	else {
            		System.out.println("Number needs to be posative");
            	}
            } catch (NumberFormatException e) {
                System.out.println("Please enter a valid integer.");
            }
        }
    }

    public double getDouble(String prompt) {
    	System.out.println(prompt);
        while (true) {
            String input = scanner.nextLine();

            try {
                return Double.parseDouble(input.trim());
            } catch (NumberFormatException e) {
                System.out.println("Please enter a valid number.");
            }
        }
    }

}
