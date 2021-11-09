package Task16;

import Task15.Book;

import java.util.Comparator;

public class AuthorTitlePriceComparator implements Comparator<Book> {

    private final Comparator<Book> comparator;

    public AuthorTitlePriceComparator() {
        this.comparator = new  AuthorTitleComparator().thenComparing(new PriceComparator());
    }

    @Override
    public int compare(Book book1, Book book2) {
        return comparator.compare(book1, book2);
    }
}
