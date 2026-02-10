package lab3;

import java.util.Scanner;

public class Weight {

	public static void main(String[] args) {
//		Scanner s = new Scanner(System.in);
//		System.out.println("Enter weight in pounds");
//		int pounds = s.nextInt();
//		s.close();
//		convertInputToStonesPounds(pounds);
		
		Scanner s2 = new Scanner(System.in);
		System.out.println("Enter weight in Kg");
		int kgs = s2.nextInt();
		s2.close();
		convertKgsToStonePounds(kgs);
	}
	
	static void convertInputToStonesPounds(int pounds) {
		System.out.printf("Weight in pounds %d", pounds);
		int stone = pounds / 14;
		int pound = pounds % 14;
		System.out.printf("\nConverted Weight: %s stone %s pounds", stone, pound);
	}
	
	static void convertKgsToStonePounds(int kg) {
		int kgPounds = (int) (kg * 2.20462);
		System.out.println(kgPounds);
		convertInputToStonesPounds(kgPounds);
	}
	
}