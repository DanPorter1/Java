package lab4;

public class Loops {

	public static void main(String[] args) {

		int[] numbers = { 1, 3, -5, 7, 0, 4, 6, 8 };
		Calc calc = new Calc();

		calc.sum(numbers);
		calc.average(numbers);
		calc.min(numbers);
		calc.max(numbers);
		calc.index(numbers);
	}

	protected String markG(int mark) {
		String result = (mark > 70) ? "Distinction" : 
			(mark > 60) ? "Merit" :
				(mark > 50) ? "Pass" : "Fail";
		return result;
	}
	
	public void results(String name, int grade) {
		String result = markG(grade);
		System.out.printf("%s you scored %d which is a %s\n", name, grade, result);
	}
	
}
