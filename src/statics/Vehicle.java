package statics;

public class Vehicle {
	
	public static int count = 0;
	private int speed;
	private int lane;
	private int distanceT;
	public static int limit = 200;
	private RegistrationPlate plate;
	
	public Vehicle(int l) {
		this.speed = 0;
		this.lane = l;
		this.distanceT = 0;
		this.plate = RegPlateFactory.getNextRegPlate();
		count++;
//		System.out.println("Car Created- Speed " + this.speed + " - Plate: " + plate.getNumber());
	}

	public void accelerate(int amount) {
		boolean valid = (this.speed + amount <= limit );
		this.speed = valid ? this.speed + amount : this.speed;
		this.distanceT = valid ? this.distanceT + amount : this.distanceT;
	}
	
	public void brake(int amount) {
		this.speed -= amount;
	}
	
	public void getDetails() {
		String res = String.format("Speed: %d - Lane: %d - Distance Traveled: %d - Plate %s", this.speed, this.lane, this.distanceT, plate.getNumber());
		System.out.println(res);
	}
	
	public static void getVehicles() {
		System.out.println(String.format("Vehicles Created: %d", count));
	}
	
	public int getSpeed() {
		return this.speed;
	}

	public void status() {
		System.out.println(String.format("%s is speeding up - now covered %d distance", plate.getNumber(), this.distanceT));
	}

	public String getPlate() {
		return plate.getNumber();
	}
	
}