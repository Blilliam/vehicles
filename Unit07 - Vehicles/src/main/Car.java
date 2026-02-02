package main;

public class Car extends Vehicle {
	static int activeCars = 0;
	static int totalCars = 0;

	boolean isActive;

	public Car() {
		super();

		isActive = true;

		activeCars++;
		totalCars++;
	}

	public Car(String name, int condition, int miles) {
		super(name, condition, miles);

		isActive = true;

		activeCars++;
		totalCars++;

		if (getMiles() >= 200) {
			activeCars--;
			isActive = false;
		}
	}

	public void setMiles(int miles) {
		if (isActive && miles >= 200) {
			activeCars--;
			setCondition(0);
			isActive = false;
		}

		this.miles = miles;
	}
}
