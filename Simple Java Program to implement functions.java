import java.util.Scanner;

public class SimpleFunctions {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking user input
        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();
        
        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();

        // Calling functions
        System.out.println("Sum: " + add(num1, num2));
        System.out.println("Difference: " + subtract(num1, num2));
        System.out.println("Product: " + multiply(num1, num2));
        System.out.println("Quotient: " + divide(num1, num2));

        scanner.close();
    }

    // Function for addition
    public static int add(int a, int b) {
        return a + b;
    }

    // Function for subtraction
    public static int subtract(int a, int b) {
        return a - b;
    }

    // Function for multiplication
    public static int multiply(int a, int b) {
        return a * b;
    }

    // Function for division
    public static double divide(int a, int b) {
        if (b == 0) {
            System.out.println("Division by zero is not allowed.");
            return 0;
        }
        return (double) a / b;
    }
}
