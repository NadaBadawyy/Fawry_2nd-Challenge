package models;

public class ShowcaseBook extends Book {
    public ShowcaseBook(String isbn, String title, int publishYear, double price, String author) {
        super(isbn, title, publishYear, price, author);
    }

    @Override
    public void deliver(String email, String address, int quantity) {
        throw new UnsupportedOperationException("Quantum book store: This book is not for sale.");
    }

    @Override
    public boolean isAvailable(int quantity) {
        return false;
    }

    @Override
    public void reduceStock(int quantity) {}

    @Override
    public boolean isSellable() {
        return false;
    }
}
