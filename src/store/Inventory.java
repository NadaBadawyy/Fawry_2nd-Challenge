package store;
import models.Book;
import java.time.Year;
import java.util.HashMap;
import java.util.Map;

public class Inventory {
    private Map<String, Book> books = new HashMap<>();

    public void addBook(Book book) {
        books.put(book.getIsbn(), book);
        System.out.println("Quantum book store: Added book " + book.getIsbn());
    }

    public void removeOutdated(int maxYearsOld) {
        int currentYear = Year.now().getValue();
        books.values().removeIf(book -> (currentYear - book.getPublishYear()) > maxYearsOld);
        System.out.println("Quantum book store: Removed outdated books");
    }

    public double buyBook(String isbn, int qty, String email, String address) {
        Book book = books.get(isbn);
        if (book == null || !book.isSellable()) {
            throw new RuntimeException("Quantum book store: Book not available");
        }
        if (!book.isAvailable(qty)) {
            throw new RuntimeException("Quantum book store: Not enough stock");
        }

        book.reduceStock(qty);
        book.deliver(email, address, qty);

        double total = book.getPrice() * qty;
        System.out.println("Quantum book store: Purchase complete, paid " + total);
        return total;
    }
}
