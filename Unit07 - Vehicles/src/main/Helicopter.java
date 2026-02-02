package main;

public class Helicopter extends Vehicle{
	int maxPassengerWeight;
	
	public Helicopter() {
		name = "Honda Accord";
		condition = 5; // 0 is bad and 5 is good
		miles = 0; // in thousands
		maxPassengerWeight = 0;
	}

	public Helicopter(String name, int condition, int miles, int maxPassengerWeight) {
		this.name = name;
		this.condition = condition;
		this.miles = miles;
	}
}
