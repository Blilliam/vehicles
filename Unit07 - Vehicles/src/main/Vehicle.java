package main;

public class Vehicle {
	static int startingValue = 20_000;
	static int conditionValueMult = 8_000;
	
	String name;
	int condition;
	int miles;
	
	public Vehicle() {
		name = "Honda Accord";
		condition = 5; // 0 is bad and 5 is good
		miles = 0; // in thousands
	}

	public Vehicle(String name, int condition, int miles) {
		this.name = name;
		this.condition = condition;
		this.miles = miles;
	}	
	
	public double getValue() {
		return startingValue + (condition * conditionValueMult);
	}
	
	public String toString() {
		return null;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCondition() {
		return condition;
	}

	public void setCondition(int condition) {
		this.condition = condition;
	}

	public int getMiles() {
		return miles;
	}

	public void setMiles(int miles) {
		this.miles = miles;
	}
	
	
}
