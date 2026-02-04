package main;

public class Truck extends Car{
	
	public Truck() {
		super();
	}
	
	public Truck(String name, int condition, int miles) {
		super(name, condition, miles);
	}
	
	public double getValue() {
		return super.getValue() * Math.pow(0.95, miles % 10);
	}
	
	public boolean tow(Vehicle v) {
		if (v.getClass().toString().substring(11) == "Truck") {
			return false;
		}
		v.setCondition(0);
		
		return true;
	}
}
