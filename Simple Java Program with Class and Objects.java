// Define a class named Car
class Car {
    // Attributes (fields)
    String brand;
    int year;
    
    // Constructor
    Car(String brand, int year) {
        this.brand = brand;
        this.year = year;
    }
    
    // Method to display car details
    void displayInfo() {
        System.out.println("Car Brand: " + brand);
        System.out.println("Manufacturing Year: " + year);
    }
}

// Main class
public class Main {
    public static void main(String[] args) {
        // Creating an object of the Car class
        Car myCar = new Car("Toyota", 2022);
        
        // Calling method to display details
        myCar.displayInfo();
    }
}
