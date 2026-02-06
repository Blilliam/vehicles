package main;

public class Vehicle {
	static int startingValue = 20_000;
	static int conditionValueMult = 8_000;
	
	String name;
	int condition;
	int miles;
	
	boolean isScrapped;
	
	public Vehicle() {
		name = "Honda Accord";
		condition = 5; // 0 is bad and 5 is good
		miles = 0; // in thousands
		isScrapped = false;
	}

	public Vehicle(String name, int condition, int miles) {
		this.name = name;
		this.condition = condition;
		this.miles = miles;
	}	
	
	public double getValue() {
		return startingValue + (condition * conditionValueMult);
	}
	
	public double getScrapValue() {
		return 0;
	}
	
	public String toString() {
		double tempValue;
		if (isScrapped) {
			tempValue = getScrapValue();
		} else {
			tempValue = getValue();
		}
		
		String output = "\n--- " + name + ", " + this.getClass().toString().substring(11) + " ---\n"
					+	"Condition: " + condition + "\n"
					+   "Miles (in thousands): " + miles + "\n"
					+   "Value: " + tempValue;
		return output;
	}

	public String getName() {
		return name;
	}
	
	public boolean getIsScrapped() {
		return isScrapped;
	}
	
	public void setIsScrapped(boolean b) {
		isScrapped = b;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCondition() {
		return condition;
	}

	public void setCondition(int condition) {
		this.condition = condition;
		if (condition == 0) {
			isScrapped = false;
		}
	}

	public int getMiles() {
		return miles;
	}

	public void setMiles(int miles) {
		if (miles >= 200) {
			setCondition(0);
		}
		this.miles = miles;
	}
	
	
}
