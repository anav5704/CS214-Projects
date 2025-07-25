package librarySystem.users;

import librarySystem.library.Book;

public class Member {
    private String name;
    private Book borrowedBook;

    public Member(String name) {
        this.name = name;
    }

    public void borrowBook(Book book) {
        borrowedBook = book;
        book.borrowBook();
    }

    public void returnBook() {
        borrowedBook.returnBook();
    }
}