package main;

import java.util.Scanner;

import lab2.Grades;
import lab3.Menu;
import lab3.Weight;
import lab4.Calc;
import lab4.Loops;
import lab6.Intrest;

public class Runner {

	public static void main(String[] args) {
		
		// Init data
		int[] numbers = {1,3,-5,7,0,4,6,8};
		String[] names = {"Daniel", "Tom", "Chris", "John", "Sam" };
		int[] grades = {45, 60, 80, 68, 99};
		
		// New instance of Classes
			Grades g = new Grades();
			Loops grade = new Loops();
			Calc calc = new Calc();
			Intrest account = new Intrest();
		
		// Invoke - With or with out string
//			g.scanMark();

		// Invoke Methods
//			calc.sum(numbers);
//			calc.average(numbers);
//			calc.min(numbers);
//			calc.max(numbers);
//			calc.index(numbers);
			
		// Grades Loop 
//			for (int i = 0; i < names.length; i++) {
//				grade.results(names[i], grades[i]);
//			}
			
		// Investment with Scanner
			Scanner s = new Scanner(System.in);
			System.out.println("Enter inital money: ");
			double money = s.nextDouble();
			System.out.println("Enter target money ");
			double target = s.nextDouble();
			s.close();
			account.investment(money, target);
			
			
			// TODO
//		Menu.lunchQueue();
//		Weight.main(args);
		
	
	}

}