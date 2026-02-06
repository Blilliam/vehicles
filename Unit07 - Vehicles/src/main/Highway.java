package main;

public class Highway {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehicle[] vs = new Vehicle[4]; 
		
		vs[0] = new Vehicle();
		vs[1] = new Car("Lightning Mcqueen", 5, 0);
		vs[2] = new Truck("Tow Mater", 5, 0);
		vs[3] = new Helicopter();
		
		for (Vehicle v:vs) {
			System.out.println(v);
		}
	}

}
