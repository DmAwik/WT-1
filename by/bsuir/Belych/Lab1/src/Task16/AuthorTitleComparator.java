package Task16;

import java.util.Comparator;
import Task15.Book;

public class AuthorTitleComparator implements Comparator<Book> {

    private final Comparator<Book> comparator;

    public AuthorTitleComparator() {
        this.comparator = new AuthorComparator().thenComparing(new TitleComparator());
    }

    @Override
    public int compare(Book book1, Book book2) {

        return comparator.compare(book1, book2);
    }
}
