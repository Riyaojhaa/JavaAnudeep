// Write a program to count and print the total number of odd and even numbers from user inputs. Program will ask for user inputs in a loop. Loop will terminate if -1 is entered as input .

import java.util.Scanner;

public class OddEvenCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int evenCount = 0;
        int oddCount = 0;

        System.out.println("Enter a numbers to find the total even and total odd numbers:");
        System.out.println("Enter -1 to terminate the loop :");

        while (true) {
            int num = scanner.nextInt();

            // Check if the input is -1 to terminate the loop
            if (num == -1) {
                break;
            }

            // Check if the number is even or odd
            if (num % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }

        // Print the counts
        System.out.println("Total even numbers: " + evenCount);
        System.out.println("Total odd numbers: " + oddCount);

        scanner.close();
    }
}
