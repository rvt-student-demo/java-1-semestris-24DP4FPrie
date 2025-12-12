package rvt;

import java.util.Scanner;

public class Skaitlu_analize {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int count = 0;
        double sum = 0;
        Double min = null;
        Double max = null;

        System.out.println("Ievadiet pozitivus skaitlus (0 vai negativs skaitlis partrauks ievadi):");

        while (true) {
            if (!sc.hasNextDouble()) {
                System.out.println("Ievade partraukta – netika ievadits skaitlis.");
                break;
            }

            double number = sc.nextDouble();

            if (number <= 0) {
                System.out.println("Ievade partraukta (ievadits 0 vai negativs skaitlis).");
                break;
            }

            count++;
            sum += number;

            if (min == null || number < min) {
                min = number;
            }
            if (max == null || number > max) {
                max = number;
            }
        }

        sc.close();

        if (count == 0) {
            System.out.println("Netika ievadīts neviens pozitīvs skaitlis.");
        } else {
            System.out.println("Skaitlu skaits: " + count);
            System.out.println("Skaitlu summa: " + sum);
            System.out.println("Videja vertiba: " + (sum / count));
            System.out.println("Mazakais skaitlis: " + min);
            System.out.println("Lielakais skaitlis: " + max);
        }
    }
}
