package lab2;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int grade = 80;
		String name = "Daniel";
		results(name, grade);
		
		
//		Attempt of arrays
		String[] names = {"Daniel", "Tom", "Chris", "John" };
		int[] grades = {45, 60, 80, 68};
		for (int i = 0; i < names.length; i++) {
			results(names[i], grades[i]);
		}
		
	}
		
	public static String markGrade(int mark) {
		if (mark > 70) {
			return"Distinction";
		} else if (mark > 60 && mark <= 70) {
			return"Marit";
		} else if (mark > 50 && mark <= 60) {
			return"Pass";
		} else {
			return"Fail";
		}
	}
	
	public static void results(String name, int grade) {
		String result = markGrade(grade);
		System.out.println(name + " you scored " + grade + " which is a " + result);
	}

}
