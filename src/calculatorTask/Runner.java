package calculatorTask;

public class Runner {

	public static void main(String[] args) {
		// New instance of Calc
		Calculator calc = new Calculator();
		// Set Menu Map
		Menu.setMenu();
		// Get Numbers
		calc.setNumOne(InputValidator.inNumber());
		calc.setNumTwo(InputValidator.inNumber());
		// Display Menu
		Menu.getMenu();




//		String opp = InputValidator.inOpp();
//		calc.calculate(opp);

		// Results
		System.out.println(calc.getResult());
	}

}