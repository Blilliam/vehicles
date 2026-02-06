package main;

public class Highway {

    public static void main(String[] args) {

        Vehicle[] arr = new Vehicle[4];

        arr[0] = new Vehicle("Generic Vehicle", 4, 50);
        arr[1] = new Car("Toyota Camry", 5, 20);
        arr[2] = new Truck("Ford F150", 5, 10);
        arr[3] = new Helicopter("Apache", 4, 30, 20);

        System.out.println("Initial Vehicles:");
        for (Vehicle v : arr) System.out.println(v);
        System.out.println();

        // Helicopter weight +10K
        ((Helicopter)arr[3]).maxPassengerWeight += 10;
        System.out.println("--------------------Helicopter weight increased by 10K:");
        System.out.println(arr[3]);
        System.out.println();

        // Car is towed
        ((Truck)arr[2]).tow(arr[1]);
        System.out.println("--------------------Car is towed:");
        System.out.println(arr[1]);
        System.out.println();

        // Vehicle rebuilt as Helicopter
        arr[0] = Helicopter.rebuild(arr[0]);
        System.out.println("--------------------Vehicle rebuilt as Helicopter:");
        System.out.println(arr[0]);
        System.out.println();

        // Original helicopter scrapped (set miles to 200)
        arr[3].setMiles(300);
        System.out.println("--------------------Original Helicopter scrapped:");
        System.out.println(arr[3]);
        System.out.println();

        // Car salvaged into golf cart
        
        arr[1] = Car.salvage((Car)arr[1]);
        System.out.println("--------------------Car salvaged into golf cart:");
        System.out.println(arr[1]);
        System.out.println();

        // Truck tows all
        ((Truck)arr[2]).towAll(arr);
        System.out.println("--------------------Truck tows all vehicles:");
        for (Vehicle v : arr) System.out.println(v);

        System.out.println("\nActive Cars: " + Car.getActiveCars());
        System.out.println("Total Cars Ever: " + Car.getTotalCars());
    }
}
