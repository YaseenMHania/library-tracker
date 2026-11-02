import java.io.File;
import java.util.Scanner;

public class LibraryTracker {

    public static void printBanner() {
        System.out.println("       WELCOME TO LIBRARY TRACKER         ");
    }

    // الطالب A: إضافة كتاب جديد
    public static void addBook(String title, String author) {
        System.out.println("Added book: " + title + " by " + author);
    }

    // الطالب A: عرض جميع الكتب
    public static void listBooks() {
        System.out.println("Listing all books from books.json...");
    }

    public static void main(String[] args) {
        printBanner();
        addBook("Clean Code", "Robert C. Martin");
        listBooks();
    }
}