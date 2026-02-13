package statics;

import java.util.ArrayList;
import java.util.Random;

public class Runner {

	public static void main(String[] args) {

		ArrayList<Vehicle> vehicles = new ArrayList<>();
		try {
			vehicles.add(new Vehicle(1));
			vehicles.add(new Vehicle(2));
			vehicles.add(new Vehicle(3));
		} catch ( IndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
		}

		for (Vehicle v: vehicles) {
			v.getDetails();
		}

		Vehicle.getVehicles();
		
		System.out.println("\nLet's Race");
	
		Random rand = new Random();
		boolean fin = true;
		while(fin) {
			for (Vehicle v : vehicles) {
//				if (v == null) continue;
				int n = rand.nextInt(10) + 1;
				v.accelerate(n);
				v.status();
				
				if (v.getSpeed() >= 200) {
					System.out.println("Winner is ");
					String winnerP = v.getPlate();
					System.out.println(String.format("Winning Plate is: %s", winnerP));
					fin = false;
					break;
				}
			}
		}
	}

}
