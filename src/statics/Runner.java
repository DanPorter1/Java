package statics;

import java.util.Random;

public class Runner {

	public static void main(String[] args) {

		Vehicle[] vehicles = new Vehicle[3];
		
		vehicles[0] = new Vehicle(1);
		vehicles[1] = new Vehicle(2);
		vehicles[2] = new Vehicle(3);
		
		for (Vehicle v: vehicles) {
			v.getDetails();
		}
		
		Vehicle.getVehicles();
		
		System.out.println("\nLet's Race");
	
		Random rand = new Random();
		boolean fin = true;
		while(fin) {
			for (Vehicle v : vehicles) {
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
