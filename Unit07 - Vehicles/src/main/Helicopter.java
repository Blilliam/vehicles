package main;

public class Helicopter extends Vehicle{
	int maxPassengerWeight;
	
	public Helicopter() {
		name = "Honda Accord";
		condition = 5; // 0 is bad and 5 is good
		miles = 0; // in thousands
		maxPassengerWeight = 0;
	}
	
	public Helicopter(Vehicle v) {
		
}

	public Helicopter(String name, int condition, int miles, int maxPassengerWeight) {
		this.name = name;
		this.condition = condition;
		this.miles = miles;
	}
	
	public double getValue() {
		return super.getValue() + (5_000 * maxPassengerWeight);
	}
	
	public double getScrapValue() {
		return 0.3 * (startingValue + 5_000 * maxPassengerWeight);
	}
	
	public String toString() {
		String output = super.toString();
		return output += "\nMax Passenger Weight (in thousands): " + maxPassengerWeight;
	}
}
