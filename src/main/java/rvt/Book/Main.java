package rvt.Book;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        ArrayList<Books> books = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Title: ");
            String title = scanner.nextLine();

            if (title.equals("")) {
                break;
            }

            System.out.print("Pages: ");
            int pages = Integer.parseInt(scanner.nextLine());

            System.out.print("Publication year: ");
            int year = Integer.parseInt(scanner.nextLine());

            books.add(new Books(title, pages, year));
        }

        System.out.println();
        System.out.print("What information will be printed? ");
        String choice = scanner.nextLine();

        if (choice.equals("everything")) {
            for (Books b : books) {
                System.out.println(b.getTitle() + ", " + b.getPages() + " pages, " + b.getYear());
            }
        } else if (choice.equals("name")) {
            for (Books b : books) {
                System.out.println(b.getTitle());
            }
        }
    }
}
