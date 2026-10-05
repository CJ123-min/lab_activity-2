public class Main {
    public static void main(String[] args) {

        Vehicle v1 = new Vehicle("Toyota", "Camry", 2018);

        System.out.println("Vehicle 1:");
        v1.displayInfo();
        System.out.println("Brand: " + v1.getBrand());
        System.out.println("Model: " + v1.getModel());
        System.out.println("Year: " + v1.getYear());
        System.out.println("Age: " + v1.calculateAge());
        System.out.println("Vintage: " + v1.isVintage());

        System.out.println();

        Vehicle v2 = new Vehicle("Volkswagen", "Beetle", 1972);

        System.out.println("Vehicle 2:");
        v2.displayInfo();
        System.out.println("Age: " + v2.calculateAge());
        System.out.println("Vintage: " + v2.isVintage());

        System.out.println();

        Vehicle v3 = new Vehicle("BMW", "M3", 2025);

        System.out.println("Vehicle 3:");
        v3.displayInfo();
        System.out.println("Age: " + v3.calculateAge());
        System.out.println("Vintage: " + v3.isVintage());

        System.out.println();

        // Valid year update
        System.out.println("Changing Vehicle 1 year to 2020:");
        boolean validUpdate = v1.setYear(2020);

        System.out.println("Update successful: " + validUpdate);
        System.out.println("Current year: " + v1.getYear());

        System.out.println();

        // Invalid year update
        System.out.println("Trying to change Vehicle 1 year to 1800:");
        boolean invalidUpdate = v1.setYear(1800);

        System.out.println("Update successful: " + invalidUpdate);
        System.out.println("Current year: " + v1.getYear());
    }
}