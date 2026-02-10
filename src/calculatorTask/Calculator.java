package calculatorTask;

public class Calculator {
	
	private double numOne;
	private double numTwo;
	private double result;
	
	// Constructor
	public Calculator() {
		System.out.println("Calc Created");
	}

	// Getters and setters
	public double getNumOne() {
		return numOne;
	}

	public void setNumOne(double numOne) {
		if (Double.isInfinite(numOne)) {
			System.out.println("Number Invalid");
		} else {
			this.numOne = numOne;
		}
	}

	public double getNumTwo() {
		return numTwo;
	}

	public void setNumTwo(double numTwo) {
		if (Double.isInfinite(numTwo)) {
			System.out.println("Number Invalid");
		} else {
			this.numTwo = numTwo;
		}
	}

	public double getResult() {
		return result;
	}

	public void setResult(double result) {
		this.result = result;
	}
	
	// to string 
	@Override
	public String toString() {
		return String.format("Calculator cuurently holds: %.1f and %.1f", numOne, numTwo);
	}
	
	// Calc methods
	public double add() {
		return this.numOne + this.numTwo;
	}
	
	public double subtract() {
		return this.numOne - this.numTwo;
	}
	
	public double multiply() {
		return this.numOne * this.numTwo;
	}

	public double divide() {
		return this.numOne / this.numTwo;
	}

}
