package org.example.oop;

public class Book {
    private final String author;
    private final String title;
    private final String genre;
    private final int numberOfPages;

    public Book(String author, String title, String genre, int numberOfPages) {
        this.author = author;
        this.title = title;
        this.genre = genre;
        this.numberOfPages = numberOfPages;
    }

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    public String getGenre() {
        return genre;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public String toString() {
        return "\nAuthor: " + getAuthor() + "\nTitle:" + getTitle() + "\nGenre: " + getGenre() + "\n" + getNumberOfPages() +
                "Pages";
    }
}
