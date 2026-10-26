public class Motorcycle extends Vehicle {
    String transmission;

    public Motorcycle(
        String brand,
        String model,
        int year,
        String transmission
    ) {
        super(brand, model, year);
        this.transmission = transmission;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Transmission: " + transmission);
    }
}