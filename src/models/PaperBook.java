package models;
import service.ShippingService;

public class PaperBook extends Book {
    private int stock;

    public PaperBook(String isbn, String title, int publishYear, double price, String author, int stock) {
        super(isbn, title, publishYear, price, author);
        this.stock = stock;
    }

    @Override
    public void deliver(String email, String address, int quantity) {
        ShippingService.send(this, address);
    }

    @Override
    public boolean isAvailable(int quantity) {
        return stock >= quantity;
    }

    @Override
    public void reduceStock(int quantity) {
        stock -= quantity;
    }

    @Override
    public boolean isSellable() {
        return true;
    }
}
