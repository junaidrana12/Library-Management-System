package Task3.LibraryManagementSystem;

import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book> books = new ArrayList<>();

    public void addBook(Book book) {
        books.add(book);
        System.out.println("Book added successfully!");
    }

    public void showBooks() {
        if (books.isEmpty()) {
            System.out.println("no books in the Library!");
            return;
        }
        System.out.println("\nLibrary Books:");
        for (Book book : books) {
            System.out.println(book);
        }
      }
    public void issueBook(int bookId) {
        for (Book book : books) {
            if (book.getId() == bookId && !book.isIssued()) {
                book.issueBook();
                System.out.println("Book issued successfully!");
                return;
             }
         }
        System.out.println("Book not found or already issued!");
    }
    public void returnBook(int bookId) {
        for (Book book : books) {
            if (book.getId() == bookId && book.isIssued()) {
                book.returnBook();
                System.out.println("Book returned successfully!");
                return;
             }
          }
        System.out.println("Book not found or not issued!");
    }
}
