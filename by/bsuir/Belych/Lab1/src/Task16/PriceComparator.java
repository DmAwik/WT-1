package Task16;

import Task15.Book;

import java.util.Comparator;

public class PriceComparator implements Comparator<Book> {
    @Override
    public int compare(Book book1, Book book2) {
        return book1.getPrice() - book2.getPrice();
    }
}
