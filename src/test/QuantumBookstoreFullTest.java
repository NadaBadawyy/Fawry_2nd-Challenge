package test;
import models.*;
import store.Inventory;

public class QuantumBookstoreFullTest {
    public static void main(String[] args) {
        Inventory store = new Inventory();
        Book paper = new PaperBook("PB123", "Clean Code", 2010, 150, "Mohammed Taha", 5);
        Book ebook = new EBook("EB456", "Zero to Java Hero", 2020, 100, "Nageeb Mahfooz", "PDF");
        Book showcase = new ShowcaseBook("SH789", "The Code That Changed My Life", 1980, 0, "Unknown");

        store.addBook(paper);
        store.addBook(ebook);
        store.addBook(showcase);

        store.removeOutdated(20);

        try {
            store.buyBook("PB123", 2, "customer@fawry.com", "Cairo");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            store.buyBook("EB456", 1, "customer@fawry.com", "Cairo");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            store.buyBook("SH789", 1, "customer@fawry.com", "Cairo");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
