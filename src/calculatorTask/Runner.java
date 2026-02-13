package calculatorTask;

public class Runner {

	public static void main(String[] args) {
		// New instance of Calc
		Calculator calc = new Calculator();
		
		// Invoke Method if needing multiple calculations
		loop(calc);
	}
	
	public static void loop(Calculator calc) {
		// Calc Main
		calc.setNumOne(InputValidator.inNumber());
		String opp = InputValidator.inOpp();
		calc.setNumTwo(InputValidator.inNumber());
		calc.calculate(opp);
		
		// Results
		System.out.println(calc.getResult());
	}
}