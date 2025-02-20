// Define a class named Calculator demonstrating polymorphism
class Calculator {
    // Method overloading for addition
    int add(int a, int b) {
        return a + b;
    }
    
    double add(double a, double b) {
        return a + b;
    }
    
    // Method overloading for subtraction
    int subtract(int a, int b) {
        return a - b;
    }
    
    double subtract(double a, double b) {
        return a - b;
    }
    
    // Method overloading for multiplication
    int multiply(int a, int b) {
        return a * b;
    }
    
    double multiply(double a, double b) {
        return a * b;
    }
    
    // Method overloading for division
    int divide(int a, int b) {
        if (b != 0) {
            return a / b;
        } else {
            throw new ArithmeticException("Cannot divide by zero");
        }
    }
    
    double divide(double a, double b) {
        if (b != 0.0) {
            return a / b;
        } else {
            throw new ArithmeticException("Cannot divide by zero");
        }
    }
}

// Main class
public class Main {
    public static void main(String[] args) {
        // Creating an object of the Calculator class
        Calculator calc = new Calculator();
        
        // Performing arithmetic operations
        System.out.println("Addition: " + calc.add(5, 3));
        System.out.println("Addition (double): " + calc.add(5.5, 3.2));
        System.out.println("Subtraction: " + calc.subtract(10, 4));
        System.out.println("Subtraction (double): " + calc.subtract(10.5, 4.3));
        System.out.println("Multiplication: " + calc.multiply(6, 7));
        System.out.println("Multiplication (double): " + calc.multiply(6.2, 7.1));
        System.out.println("Division: " + calc.divide(20, 4));
        System.out.println("Division (double): " + calc.divide(20.5, 4.1));
    }
}
