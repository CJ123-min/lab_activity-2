public class Vehicle {
    private String brand;
    private String model;
    private int year;

    public Vehicle(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;

        if (year >= 1886 && year <= 2026) {
            this.year = year;
        } else {
            this.year = 2026;
        }
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public boolean setYear(int year) {
        if (year >= 1886 && year <= 2026) {
            this.year = year;
            return true;
        }

        return false;
    }

    public void displayInfo() {
        int age = calculateAge();
        boolean vintage = isVintage();

        System.out.println(brand + " " + model + " (" + year + ")");
        System.out.println("Age: " + age);
        System.out.println("Vintage: " + vintage);
    }

    public int calculateAge() {
        return 2026 - year;
    }

    public boolean isVintage() {
        return calculateAge() > 25;
    }
}