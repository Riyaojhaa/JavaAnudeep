package Labs;

import java.util.Random;

public class Array3DOperations {
    public static void main(String[] args) {
        int[][][] array3D = new int[3][3][3];
        Random random = new Random();

        // 1. Initializing the 3D array
        System.out.println("Initializing the 3D array with random values:");
        for (int i = 0; i < array3D.length; i++) {
            for (int j = 0; j < array3D[i].length; j++) {
                for (int k = 0; k < array3D[i][j].length; k++) {
                    array3D[i][j][k] = random.nextInt(100); // Random value [0,99]
                }
            }
        }

        // 2. Find the maximum value in the array
        int max = Integer.MIN_VALUE;
        int sum = 0;
        int count = 0;

        for (int[][] matrix : array3D) {
            for (int[] row : matrix) {
                for (int element : row) {
                    max = Math.max(max, element);
                    sum += element;
                    count++;
                }
            }
        }

        double average = (double) sum / count;

        // 3. Display the array
        System.out.println("\n3D Array:");
        for (int i = 0; i < array3D.length; i++) {
            System.out.println("Layer " + (i + 1) + ":");
            for (int j = 0; j < array3D[i].length; j++) {
                for (int k = 0; k < array3D[i][j].length; k++) {
                    System.out.print(array3D[i][j][k] + " ");
                }
                System.out.println();
            }
        }

        // Display results
        System.out.println("\nMaximum value in the 3D array: " + max);
        System.out.println("Average of all elements: " + average);
    }
}
