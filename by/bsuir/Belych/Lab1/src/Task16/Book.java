package Task16;


import java.util.Objects;

public class Book implements Comparable<Book> {
    public String title;
    public String author;
    public int price;
    private static int edition;
    private int isbn;

    public Book(String title, String author, int price, int isbn){
        this.title = title;
        this.author = author;
        this.price = price;
        this.isbn = isbn;
    }
    public void setPrice(int price){

        this.price = price;
    }

    public int getPrice(){

        return price;
    }

    public void setIsbn(int isbn){

        this.isbn = isbn;
    }

    public int getIsbn(){
        return isbn;
    }

    public static void setEdition(int value){

        edition = value;
    }

    public static int getEdition(){

        return  edition;
    }

    public void setTitle(String title){

        this.title = title;
    }

    public String getTitle(){

        return title;
    }

    public void setAuthor(String author){

        this.author = author;
    }

    public String getAuthor(){

        return author;
    }
    @Override
    public boolean equals(Object obj){
        if(obj == this)
            return true;
        if(!(obj instanceof Book))
            return false;

        Book book = (Book)obj;
        return  book.title == title &&
                book.author == author &&
                book.price == price &&
                book.edition == edition;
    }
    @Override
    public int hashCode(){
        return Objects.hash(title, author, price,edition);
    }

    @Override
    public String toString(){

        return ". Title " + title + ". Author " + author + ". Price: " + price+ ". edition: "+edition;
    }
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return new Book(this.title, this.author, this.price, this.isbn);
    }
    @Override
    public int compareTo(Book book) {
       return Integer.compare(isbn, ((Book) book).getIsbn());
    }

}
