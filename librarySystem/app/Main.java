package librarySystem.app;

import librarySystem.users.Member;
import librarySystem.library.Book;;

public class Main {
    public static void main(String[] args) {
        Member member = new Member("Anav");
        Book book = new Book("Harry Potter");

        member.borrowBook(book);
        book.displayInfo();
        member.returnBook();
        book.displayInfo();
    }
}