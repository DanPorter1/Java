package lab2;

import java.util.Scanner;

public class Grades {

	public void main(String[] args) {
		int grade = 80;
		String name = "Daniel";
		results(name, grade);
		
		
//		Attempt of arrays
		String[] names = {"Daniel", "Tom", "Chris", "John", "Sam" };
		int[] grades = {45, 60, 80, 68, 99};
		for (int i = 0; i < names.length; i++) {
			results(names[i], grades[i]);
		}
	}
	
	private String markG(int mark) {
		String result = (mark > 70) ? "Distinction" : 
			(mark > 60) ? "Merit" :
				(mark > 50) ? "Pass" : "Fail";
		return result;
	}
	
	public void scanMark() {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter your grade.");
		int yourGrade = s.nextInt();
		s.close();
		results(yourGrade);
	}		
	
	public void scanMark(String name) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter your grade.");
		int yourGrade = s.nextInt();
		s.close();
		results(name, yourGrade);
	}			
				
	public void results(int grade) {
		String result = markG(grade);
		String fResult = String.format("You scored %d which is a %s", grade, result);
		System.out.println(fResult);
	}

	public void results(String name, int grade) {
		String result = markG(grade);
		System.out.printf("%s you scored %d which is a %s\n", name, grade, result);
	}
}

