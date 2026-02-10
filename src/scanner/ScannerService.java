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
