package org.example;

public class Book {
    private String title;
    private String author;
    private String ISBN;
    private String publicationDate;
    private boolean isAvailable;

    public Book(String title, String author, String ISBN, String publicationDate) {
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
        this.publicationDate = publicationDate;
        this.isAvailable = true;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getPublicationDate() {
        return publicationDate;
    }

    public void setPublicationDate(String publicationDate) {
        this.publicationDate = publicationDate;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    @Override
    public String toString() {
        return "Book{" + "title='" + title + '\'' + ", author='" + author + '\'' + ", ISBN='" + ISBN + '\'' + ", publicationDate='" + publicationDate + '\'' + ", isAvailable=" + isAvailable + '}';
    }
}
