package rvt;
import java.util.Scanner;

public class Reading {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ievadi vecumu. ");

        String message = scanner.nextLine();

        System.out.println("Jūsu vecums ir " + message);
        
    }
}
