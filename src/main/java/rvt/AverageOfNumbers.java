package rvt;
import java.util.Scanner;

public class AverageOfNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = 0;
        double sum = 0;

        while (true) {
            System.out.print("Enter a number (0 to stop): ");
            double num = scanner.nextDouble();

            if (num == 0) {
                break; // Stop when user enters 0
            }

            sum += num;
            count++;
        }

        double average = sum / count;

        System.out.println("Average: " + average);

        scanner.close();
    }
}
