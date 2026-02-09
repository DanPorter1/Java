package lab2;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int mark = 55;
		
		if (mark > 70) {
			System.out.println("Distinction");
		} else if (mark > 60 && mark <= 70) {
			System.out.println("Marit");
		} else if (mark > 50 && mark <= 60) {
			System.out.println("Pass");
		} else {
			System.out.println("Fail");
		}
	}

}
