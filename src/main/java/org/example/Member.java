package org.example;

import java.util.ArrayList;
import java.util.List;

public class Member {
    private String name;
    private String membershipID;
    private String contactInfo;
    private List<Book> borrowedBooks;

    // Constructor
    public Member(String name, String membershipID, String contactInfo) {
        this.name = name;
        this.membershipID = membershipID;
        this.contactInfo = contactInfo;
        this.borrowedBooks = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMembershipID() {
        return membershipID;
    }

    public void setMembershipID(String membershipID) {
        this.membershipID = membershipID;
    }

    public String getContactInfo() {
        return contactInfo;
    }

    public void setContactInfo(String contactInfo) {
        this.contactInfo = contactInfo;
    }

    public List<Book> getBorrowedBooks() {
        return borrowedBooks;
    }

    public void borrowBook(Book book) {
        if (book.isAvailable()) {
            borrowedBooks.add(book);
            book.setAvailable(false);
        } else {
            System.out.println("Book is not available.");
        }
    }

    public void returnBook(Book book) {
        if (borrowedBooks.contains(book)) {
            borrowedBooks.remove(book);
            book.setAvailable(true);
        }
    }

    @Override
    public String toString() {
        return "Member{" + "name='" + name + '\'' + ", membershipID='" + membershipID + '\'' + ", contactInfo='" + contactInfo + '\'' + ", borrowedBooks=" + borrowedBooks + '}';
    }
}

