package Assignment5;

interface BaseVehicle {
	void start();
}

interface AdvancedVehicle extends BaseVehicle {
	void stop();

	boolean refuel(int amount);
}

class Car implements AdvancedVehicle {
	private int fuel;

	public Car(int fuel) {
		this.fuel = fuel;
	}

	public void start() {
		if (fuel > 0) {
			System.out.println("Car started with fuel: " + fuel);
		} else {
			System.out.println("Cannot start, fuel is empty.");
		}
	}

	public void stop() {
		System.out.println("Car stopped.");
	}

	public boolean refuel(int amount) {
		if (amount > 0) {
			fuel += amount;
			System.out.println("Car refueled. Current fuel: " + fuel);
			return true;
		} else {
			System.out.println("Invalid fuel amount.");
			return false;
		}
	}
}

public class vehicle {
	public static void main(String[] args) {
		BaseVehicle base = new Car(10);
		base.start();

		AdvancedVehicle adv = new Car(5);
		adv.start();
		adv.refuel(15);
		adv.stop();
	}
}