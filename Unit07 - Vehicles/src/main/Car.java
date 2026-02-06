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
		super.setMiles(miles);
		
		if (isActive && miles >= 200) {
			activeCars--;
			setCondition(0);
			isActive = false;
		}
	}
	
	public double getValue() {
		return super.getValue() + (1_000 * condition);
	}
	
	public double getScrapValue() {
		double tempVal = 0.1 * (startingValue + (9_000 * 5)) - (500 * miles);
		return Math.max(Math.min(tempVal, 20_000), 0);
	}
	
	public void setCondition(int condition) {
		super.setCondition(condition);
		
		if (condition == 0 && isActive) {
			activeCars--;
			isActive = false;
		}
	}
	
	public static int getActiveCars() {
		return activeCars;
	}
	
	public static int getTotalCars() {
		return totalCars;
	}
}
