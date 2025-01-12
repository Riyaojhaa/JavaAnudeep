package Labs;
// 1. Write a program to find out all the armstrong numbers within a given range using a method named printArmstrong Number( int start, int end) by taking input from the user. The program should print the Armstrong number in a given range starting from "start" and ending with "end". Armstrong Number Example: 153 13+53+33=153 (Number which is equal to the sum of the cubes of its digits) Note: input should be taken from the keyboard. Use a loop to calculate the Armstrong number from "start" to "end". Also use loops to calculate the cube of a number. Do not use the Math.pow() function.

import java.util.Scanner;

public class ArmstrongNumberFinder {

    // Method to check if a number is an Armstrong number or not
    private static boolean isArmstrong(int num) {
        int originalNum = num;
        int sum = 0;

        // Calculating the sum of cubes of digits
        while (num != 0) {
            int digit = num % 10;
            int cube = 1;

            // Calculating the cube using a loop (digit^3)
            for (int i = 0; i < 3; i++) {
                cube *= digit;
            }

            sum += cube;
            num /= 10;
        }

        // Return true if the sum is equal to the original number
        return sum == originalNum;
    }

    // Method to print all Armstrong numbers in the given range
    public static void printArmstrongNumber(int start, int end) {
        System.out.println("Armstrong numbers between " + start + " and " + end + ":");
        for (int i = start; i <= end; i++) {
            if (isArmstrong(i)) {
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking input from the user
        System.out.println("Enter the start of the range:");
        int start = scanner.nextInt();

        System.out.println("Enter the end of the range:");
        int end = scanner.nextInt();

        // Call the method to print Armstrong numbers in the range
        printArmstrongNumber(start, end);

        scanner.close();
    }
}
