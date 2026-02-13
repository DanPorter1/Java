package calculatorTask;

public class Calculator {
	
	private double numOne;
	private double numTwo;
	private double result;
	
	// Constructor
	public Calculator() {
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
	public void add() {
		setResult(this.numOne + this.numTwo);
	}
	
	public void subtract() {
		setResult(this.numOne - this.numTwo);
	}
	
	public void multiply() {
		setResult(this.numOne * this.numTwo);
	}

	public void divide() {
		setResult(this.numOne / this.numTwo);
	}
	
	public void calculate(String opp) {
		switch (opp) {
		case "+": add(); break;
		case "-": subtract(); break;
		case "*": multiply(); break;
		case "/": divide(); break;
		default: throw new IllegalArgumentException("Unexpected value: " + opp);
		}
	}

}
