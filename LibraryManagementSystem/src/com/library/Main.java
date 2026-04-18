package com.library;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        LibraryService service = new LibraryService();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n1. Add Book");
            System.out.println("2. View Books");
            System.out.println("3. Register User");
            System.out.println("4. Issue Book");
            System.out.println("5. Return Book");
            System.out.println("6. Exit");

            System.out.print("Enter choice: ");
            int choice = sc.nextInt();
            sc.nextLine();

            if (choice == 1) service.addBook();
            else if (choice == 2) service.viewBooks();
            else if (choice == 3) service.registerUser();
            else if (choice == 4) service.issueBook();
            else if (choice == 5) service.returnBook();
            else if (choice == 6) {
                System.out.println("Exiting...");
                break;
            } else {
                System.out.println("Invalid choice");
            }
        }
    }
}