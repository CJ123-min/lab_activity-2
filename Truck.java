public class Truck extends Vehicle {
    int loadCapacity;

    public Truck(String brand, String model, int year, int loadCapacity) {
        super(brand, model, year);
        this.loadCapacity = loadCapacity;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Load capacity: " + loadCapacity);
    }
}