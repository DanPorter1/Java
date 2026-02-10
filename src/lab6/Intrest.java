package lab6;

public class Intrest {

	public static void main(String[] args) {
	}
	
	public void investment(double money, double targetValue) {
		double iMoney = money;
		double cMoney = iMoney;
		double intrestR = 0.05;
		int loops = 0;
		double target = targetValue;
		
		while (cMoney < target) {
			cMoney = cMoney + (cMoney * intrestR);
			loops++;
		}
		System.out.println(String.format("It will take %d years to grow to £%.2f starting with £%.2f with an interest rate of %.2f%%", loops, target, iMoney, intrestR * 100));
	
	}
	
	public void investment() {
		double iMoney = 100;
		double cMoney = iMoney;
		double intrestR = 0.05;
		int loops = 0;
		
		while (cMoney < 200) {
			cMoney = cMoney + (cMoney * intrestR);
			loops++;
		}
		System.out.println(String.format("It will take %d years to grow to £200: Starting with £%.0f", loops, iMoney));
	
	}
}
	

