public class Vehicle {
    String brand;
    String model;
    int year;

    void displayInfo() {
    int age = 2026 - year;
    boolean vintage = age > 25;

    System.out.println(brand + " " + model + " (" + year + ")");
    System.out.println("Age: " + age);
    System.out.println("Vintage: " + vintage);
}
    
    Vehicle(String brand, String model, int year){
    
    this.brand = brand;
    this.model = model;
    this.year = year;
    }
}