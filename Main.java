public class Main {

    public static void printDetails(Vehicle vehicle) {
        vehicle.displayInfo();
    }

    public static void main(String[] args) {

        Vehicle vehicle = new Car("Mitsubishi", "Mirage", 2026, 4);
        vehicle.displayInfo();
        System.out.println();

        vehicle = new Motorcycle("Yamaha", "Mio i 125", 2015, "Manual");
        vehicle.displayInfo();
        System.out.println();

        System.out.println("=== Demo 2: Method Parameter ===");

        Car car = new Car("Ford", "Mustang", 2026, 4);

        Motorcycle motor =
            new Motorcycle("Honda", "Click 125", 2026, "Matic");

        printDetails(car);
        System.out.println();

        printDetails(motor);
        System.out.println();

        System.out.println("=== Demo 3: Polymorphic Array ===");

        Vehicle[] vehicles = {
            new Car("Ford", "Mustang", 2026, 4),
            new Motorcycle("Honda", "Click 125", 2026, "Matic")
        };

        for (Vehicle currentVehicle : vehicles) {
            printDetails(currentVehicle);
            System.out.println();
        }
    }
}