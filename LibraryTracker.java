import java.io.File;
import java.util.Scanner;

public class LibraryTracker {

    public static void printBanner() {
        System.out.println("       WELCOME TO LIBRARY TRACKER         ");
    }
public static void addBook(String title, String author) {
        System.out.println("Added book: " + title + " by " + author);
    }

    public static void listBooks() {
        System.out.println("Listing all books from books.json...");
    }

    // Student B: Search function
    public static void searchBook(String query) {
        System.out.println("Searching for book: " + query);
    }

    // Student B: Remove function
    public static void removeBook(int id) {
        System.out.println("Removed book with ID: " + id);
    }

    public static void main(String[] args) {
        printBanner();
        addBook("Clean Code", "Robert C. Martin");
        listBooks();
        searchBook("Clean Code");
        removeBook(1);
    }
}