package Prob3;

public class LibraryTest {
    void main() {
        Library library = new Library();

        // Add books
        library.addBook("111", "Book #1", "Author #1");
        library.addBook("222", "Book #2", "Author #2");
        library.addBook("333", "Book #3", "Author #3");
        library.addBook("111", "Book #4", "Author #4");

        System.out.println();

        library.listAllBooks();

        library.borrowBook("111");
        library.borrowBook("111"); // already borrowed

        System.out.println("");
        System.out.println("Details 222: " + library.getBookDetails("222"));
        System.out.println("Is book 111 borrowed: " + library.isBookBorrowed("111"));

        // listBorrowedBooks
        System.out.println("");
        library.listBorrowedBooks();

        library.returnBook("111");
        library.listBorrowedBooks();

        library.listAllBooks();
    }
}
