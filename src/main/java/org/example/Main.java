package org.example;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();

        Book book1 = new Book("Java Programming", "John Doe", "123456", "2020");
        Book book2 = new Book("Python Essentials", "Jane Smith", "789012", "2019");

        library.addBook(book1);
        library.addBook(book2);

        Member member = new Member("Alice Johnson", "M001", "alice@example.com");

        library.registerMember(member);

        library.borrowBook(member, book1);

        library.displayAvailableBooks();

        library.returnBook(member, book1);

        library.displayAvailableBooks();
    }
}
