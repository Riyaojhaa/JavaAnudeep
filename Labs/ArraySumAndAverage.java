package Labs;
// .Write a Java program that takes an array of integers as input from the user and then calculates the sum and average of the elements in the array. The program should output the sum and average.
import java.util.Scanner;

public class ArraySumAndAverage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the size of the array
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();

        int[] numbers = new int[n];

        // Input elements of the array
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }

        // Calculating the sum of elements
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }

        // Calculating the average
        double average = (double) sum / n;

        // Output the sum and average
        System.out.println("Sum of the elements: " + sum);
        System.out.println("Average of the elements: " + average);

        scanner.close();
    }
}