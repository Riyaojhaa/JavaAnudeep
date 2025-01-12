package Labs;
import java.util.Scanner;

public class GrossSalaryCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Enter the basic salary of the employee (or -1 to exit): ");
            double basicSalary = scanner.nextDouble();

            // Exit condition
            if (basicSalary == -1) {
                System.out.println("Exiting the program.");
                break;
            }

            double hra, da, grossSalary;

            // Calculating HRA and DA
            if (basicSalary > 15000) {
                hra = 0.20 * basicSalary; // 20% HRA
                da = 0.60 * basicSalary; // 60% DA
            } else {
                hra = 3000;
                da = 0.70 * basicSalary; // 70% DA
            }

            // Calculate gross salary
            grossSalary = basicSalary + hra + da;
            System.out.println("HRA: " + hra);
            System.out.println("DA: " + da);
            System.out.println("Gross Salary: " + grossSalary);
        }

        scanner.close();
    }
}
