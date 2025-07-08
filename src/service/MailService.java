package service;
import models.Book;

public class MailService {
    public static void send(Book book, String email) {
        System.out.println("Quantum book store: Emailing book to " + email);
    }
}
