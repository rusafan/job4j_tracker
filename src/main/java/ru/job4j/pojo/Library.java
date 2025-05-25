package ru.job4j.pojo;

public class Library {
    public static void main(String[] args) {
        Book detective = new Book("The Adventures of Sherlock Holme", 100);
        Book novel = new Book("Shogun", 50);
        Book it = new Book("Clean code", 20);
        Book classic = new Book("War and Peace", 150);
        Book[] books = new Book[4];
        books[0] = detective;
        books[1] = novel;
        books[2] = it;
        books[3] = classic;
        for (int index = 0; index < books.length; index++) {
            Book book = books[index];
            System.out.println(book.getName() + " - " + book.getPageCount());
        }
        Book change = books[0];
        books[0] = books[3];
        books[3] = change;
        for (int index = 0; index < books.length; index++) {
            Book book = books[index];
            System.out.println(book.getName() + " - " + book.getPageCount());
        }
        for (int index = 0; index < books.length; index++) {
            Book book = books[index];
            if (book.equals(it)) {
                System.out.println(book.getName() + " - " + book.getPageCount());
            }
        }
    }
}
