package com.library;

import java.sql.*;
import java.util.Scanner;

public class LibraryService {

    Scanner sc = new Scanner(System.in);

    public void addBook() {
        try {
            System.out.print("Enter title: ");
            String title = sc.nextLine();

            System.out.print("Enter author: ");
            String author = sc.nextLine();

            Connection con = DBConnection.getConnection();

            String sql = "INSERT INTO books(title, author, available) VALUES (?, ?, true)";
            PreparedStatement ps = con.prepareStatement(sql);

            ps.setString(1, title);
            ps.setString(2, author);

            ps.executeUpdate();

            System.out.println("Book added successfully");

        } catch (Exception e) {
            System.out.println("Error adding book");
        }
    }

    public void viewBooks() {
        try {
            Connection con = DBConnection.getConnection();
            Statement st = con.createStatement();

            ResultSet rs = st.executeQuery("SELECT * FROM books");

            while (rs.next()) {
                System.out.println(
                        rs.getInt("id") + " | " +
                                rs.getString("title") + " | " +
                                rs.getString("author") + " | Available: " +
                                rs.getBoolean("available")
                );
            }

        } catch (Exception e) {
            System.out.println("Error fetching books");
        }
    }

    public void registerUser() {
        try {
            System.out.print("Enter user name: ");
            String name = sc.nextLine();

            Connection con = DBConnection.getConnection();

            String sql = "INSERT INTO users(name) VALUES (?)";
            PreparedStatement ps = con.prepareStatement(sql);

            ps.setString(1, name);
            ps.executeUpdate();

            System.out.println("User registered");

        } catch (Exception e) {
            System.out.println("Error registering user");
        }
    }

    public void issueBook() {
        try {
            System.out.print("Enter book id: ");
            int bookId = sc.nextInt();

            System.out.print("Enter user id: ");
            int userId = sc.nextInt();
            sc.nextLine();

            Connection con = DBConnection.getConnection();

            String check = "SELECT available FROM books WHERE id=?";
            PreparedStatement ps = con.prepareStatement(check);
            ps.setInt(1, bookId);

            ResultSet rs = ps.executeQuery();

            if (rs.next() && rs.getBoolean("available")) {

                String issue = "INSERT INTO transactions(book_id, user_id, issue_date) VALUES (?, ?, CURDATE())";
                PreparedStatement ps2 = con.prepareStatement(issue);
                ps2.setInt(1, bookId);
                ps2.setInt(2, userId);
                ps2.executeUpdate();

                String update = "UPDATE books SET available=false WHERE id=?";
                PreparedStatement ps3 = con.prepareStatement(update);
                ps3.setInt(1, bookId);
                ps3.executeUpdate();

                System.out.println("Book issued");

            } else {
                System.out.println("Book not available");
            }

        } catch (Exception e) {
            System.out.println("Error issuing book");
        }
    }

    public void returnBook() {
        try {
            System.out.print("Enter transaction id: ");
            int tid = sc.nextInt();
            sc.nextLine();

            Connection con = DBConnection.getConnection();

            String sql = "UPDATE transactions SET return_date=CURDATE(), fine=DATEDIFF(CURDATE(), issue_date)*2 WHERE id=?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, tid);
            ps.executeUpdate();

            String updateBook = "UPDATE books SET available=true WHERE id=(SELECT book_id FROM transactions WHERE id=?)";
            PreparedStatement ps2 = con.prepareStatement(updateBook);
            ps2.setInt(1, tid);
            ps2.executeUpdate();

            System.out.println("Book returned");

        } catch (Exception e) {
            System.out.println("Error returning book");
        }
    }
}