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
        while (true) {
            System.out.println(prompt);
            String input = scanner.nextLine();

            if (input.trim().isEmpty()) {
                System.out.println("Input cannot be blank.");
            } else {
                return input;
            }
        }
    }

    public int getInt(String prompt) {
        while (true) {
            System.out.println(prompt);
            String input = scanner.nextLine();

            try {
                return Integer.parseInt(input.trim());
            } catch (NumberFormatException e) {
                System.out.println("Please enter a valid integer.");
            }
        }
    }

    public double getDouble(String prompt) {
        while (true) {
            System.out.println(prompt);
            String input = scanner.nextLine();

            try {
                return Double.parseDouble(input.trim());
            } catch (NumberFormatException e) {
                System.out.println("Please enter a valid number.");
            }
        }
    }

    public float getFloat(String prompt) {
        while (true) {
            System.out.println(prompt);
            String input = scanner.nextLine();

            try {
                return Float.parseFloat(input.trim());
            } catch (NumberFormatException e) {
                System.out.println("Please enter a valid float.");
            }
        }
    }

    public long getLong(String prompt) {
        while (true) {
            System.out.println(prompt);
            String input = scanner.nextLine();

            try {
                return Long.parseLong(input.trim());
            } catch (NumberFormatException e) {
                System.out.println("Please enter a valid long number.");
            }
        }
    }

    public boolean getBoolean(String prompt) {
        while (true) {
            System.out.println(prompt + " (true/false)");
            String input = scanner.nextLine().trim().toLowerCase();

            if (input.equals("true") || input.equals("t") || input.equals("yes") || input.equals("y")) {
                return true;
            }
            if (input.equals("false") || input.equals("f") || input.equals("no") || input.equals("n")) {
                return false;
            }

            System.out.println("Please enter true/false or yes/no.");
        }
    }
}
