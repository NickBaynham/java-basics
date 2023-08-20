package org.example.oop;

/***
 * BookDemo
 *   Class Book is immutable
 */
public class BookDemo {
    public static void main(String[] args) {
        Book book = new Book("Scott Steele", "How to Make Your First Million", "Self Help", 300);
        System.out.println(book);
    }
}
