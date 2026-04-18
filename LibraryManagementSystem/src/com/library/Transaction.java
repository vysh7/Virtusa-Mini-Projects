package com.library;

public class Transaction {
    private int id;
    private int bookId;
    private int userId;
    private String issueDate;
    private String returnDate;
    private double fine;

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public int getBookId() { return bookId; }
    public void setBookId(int bookId) { this.bookId = bookId; }

    public int getUserId() { return userId; }
    public void setUserId(int userId) { this.userId = userId; }

    public String getIssueDate() { return issueDate; }
    public void setIssueDate(String issueDate) { this.issueDate = issueDate; }

    public String getReturnDate() { return returnDate; }
    public void setReturnDate(String returnDate) { this.returnDate = returnDate; }

    public double getFine() { return fine; }
    public void setFine(double fine) { this.fine = fine; }
}