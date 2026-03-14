package Prob3;

import java.util.HashMap;
import java.util.Map;

public class Library {
    HashMap<String, Book> books;

    public Library() {
        books = new HashMap<>();
    }

    public void addBook(String isbn, String title, String author) {
        if (books.containsKey(isbn)) {
            System.out.println("Book with ISBN " + isbn + " already exists.");
        } else {
            books.put(isbn, new Book(isbn, title, author));
            System.out.println("Book added successfully: " + title);
        }
    }

    public void borrowBook(String isbn) {
        if (!books.containsKey(isbn)) {
            System.out.println("Book with ISBN " + isbn + " not found.");
            return;
        }

        Book book = books.get(isbn);

        if (book.isBorrowed()) {
            System.out.println("Book is already borrowed: " + book.getISBN());
        } else {
            book.setBorrowed(true);
            System.out.println("Book borrowed successfully: " + book.getISBN());
        }
    }

    public void returnBook(String isbn) {
        if (!books.containsKey(isbn)) {
            System.out.println("Book with ISBN " + isbn + " not found.");
            return;
        }

        Book book = books.get(isbn);

        if (!book.isBorrowed()) {
            System.out.println("Book was not borrowed: " + book.getISBN());
        } else {
            book.setBorrowed(false);
            System.out.println("Book returned successfully: " + book.getISBN());
        }
    }

    public boolean isBookBorrowed(String isbn) {
        if (!books.containsKey(isbn)) {
            System.out.println("Book with ISBN " + isbn + " not found.");
            return false;
        }
        return books.get(isbn).isBorrowed();
    }

    public Book getBookDetails(String isbn) {
        if (!books.containsKey(isbn)) {
            System.out.println("Book with ISBN " + isbn + " not found.");
            return null;
        }
        return books.get(isbn);
    }

    public void listAllBooks() {
        if (books.isEmpty()) {
            System.out.println("No books in the library.");
            return;
        }

        System.out.println("All Books:");
        for (Map.Entry<String, Book> entry : books.entrySet()) {
            System.out.println(entry.getValue());
        }
    }

    public void listBorrowedBooks() {
        boolean found = false;
        System.out.println("Borrowed Books:");

        for (Map.Entry<String, Book> entry : books.entrySet()) {
            if (entry.getValue().isBorrowed()) {
                System.out.println(entry.getValue());
                found = true;
            }
        }

        if (!found) {
            System.out.println("No borrowed books.");
        }
    }
}
