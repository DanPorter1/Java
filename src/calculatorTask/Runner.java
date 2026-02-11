package calculatorTask;

import scanner.ScannerService;

public class Runner {

	public static void main(String[] args) {
		String opp = "";
		Calculator calc = new Calculator();
		ScannerService s = new ScannerService();
		calc.setNumOne(s.getDouble("Please enter a valid number."));
		calc.setNumTwo(s.getDouble("Please enter a valid number."));
		System.out.println(calc);
		opp = s.getString("Enter opperator");
		s.closeScanner();
		
		switch (opp) {
		case "+": calc.add();
		break;
		case "-": calc.subtract();
		break;
		case "*": calc.multiply();
		break;
		case "/": calc.divide();
		break;
		default:
			throw new IllegalArgumentException("Unexpected value: " + opp);
		}
		
		System.out.println(calc.getResult());
	}

}