package rvt;
import java.util.ArrayList;
import java.util.Scanner;

public class List {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();

        while (true) {
            String input = scanner.nextLine();

            if (input.isEmpty()) {
                break;
            }

            list.add(input);
        }
        System.out.println("\nIn total: " + list.size());
    }
}


