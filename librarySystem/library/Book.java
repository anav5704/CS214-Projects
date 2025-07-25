package librarySystem.library;

public class Book {
    private String title;
    private Boolean isAvailable;

    public Book(String title) {
        this.title = title;
        isAvailable = true;
    }

    public void borrowBook() {
        isAvailable = false;
    }

    public void returnBook() {
        isAvailable = true;
    }

    public void displayInfo() {
        System.err.println("Title: " + title);
        System.out.println("Available: " + isAvailable);
    }
}