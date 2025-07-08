package service;
import models.Book;

public class ShippingService {
    public static void send(Book book, String address) {
        System.out.println("Quantum book store: Shipping book to " + address);
    }
}
