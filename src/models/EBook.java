package models;
import service.MailService;

public class EBook extends Book {
    private String fileType;

    public EBook(String isbn, String title, int publishYear, double price, String author, String fileType) {
        super(isbn, title, publishYear, price, author);
        this.fileType = fileType;
    }

    @Override
    public void deliver(String email, String address, int quantity) {
        MailService.send(this, email);
    }

    @Override
    public boolean isAvailable(int quantity) {
        return true;
    }

    @Override
    public void reduceStock(int quantity) {}

    @Override
    public boolean isSellable() {
        return true;
    }
}
