public class ControlStructuresExample {
    public static void main(String[] args) {
        int sum = 0;

        // Using for loop to calculate sum of even numbers
        for (int i = 1; i <= 100; i++) {
            // Using if statement to check if the number is even
            if (i % 2 == 0) {
                sum += i;
            }
        }

        // Display the result
        System.out.println("The sum of all even numbers from 1 to 100 is: " + sum);

        // Using a while loop to print the numbers from 1 to 10
        int count = 1;
        while (count <= 10) {
            System.out.println("Number: " + count);
            count++;
        }
    }
}
