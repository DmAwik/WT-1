package Task14;


import java.util.Objects;

public class Book {
    public String title;
    public String author;
    public int price;
    private static int edition;

    public Book(String title, String author, int price){
        this.title = title;
        this.author = author;
        this.price = price;
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
    protected Object clone(){
        return new Book(this.title, this.author, this.price);
    }

}


