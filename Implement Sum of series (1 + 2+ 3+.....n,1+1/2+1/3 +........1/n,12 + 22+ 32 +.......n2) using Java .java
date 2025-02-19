import java.util.Scanner;

public class SumOfSeries {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input from user
        System.out.print("Enter the value of n: ");
        int n = scanner.nextInt();

        // Compute the sums
        int sum1 = sumOfNaturalNumbers(n);
        double sum2 = sumOfHarmonicSeries(n);
        int sum3 = sumOfSquares(n);

        // Print results
        System.out.println("Sum of first " + n + " natural numbers: " + sum1);
        System.out.println("Sum of first " + n + " terms of harmonic series: " + sum2);
        System.out.println("Sum of squares of first " + n + " numbers: " + sum3);

        scanner.close();
    }

    // Sum of first n natural numbers: S1 = 1 + 2 + ... + n
    public static int sumOfNaturalNumbers(int n) {
        return n * (n + 1) / 2; // Using formula
    }

    // Sum of harmonic series: S2 = 1 + 1/2 + 1/3 + ... + 1/n
    public static double sumOfHarmonicSeries(int n) {
        double sum = 0.0;
        for (int i = 1; i <= n; i++) {
            sum += 1.0 / i;
        }
        return sum;
    }

    // Sum of squares of first n natural numbers: S3 = 1^2 + 2^2 + ... + n^2
    public static int sumOfSquares(int n) {
        return (n * (n + 1) * (2 * n + 1)) / 6; // Using formula
    }
}
