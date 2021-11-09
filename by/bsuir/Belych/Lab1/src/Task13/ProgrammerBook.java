package Task13;

import Task12.Book;

public class ProgrammerBook extends Book {
    private String language;
    private int level;

    public ProgrammerBook(String title, String author, int price, String language, int level){
        super(title, author, price);
        this.language = language;
        this.level = level;
    }

    @Override
    public String toString(){

        return super.toString()+ "(Language  " + language + ", level: " + level + ")";
    }

    @Override
    public int hashCode(){
        return 31 * super.hashCode() * language.hashCode();
    }

    @Override
    public boolean equals(Object obj){
        ProgrammerBook progBook = (ProgrammerBook)obj;
        return super.equals(progBook) && (progBook.level == level);
    }
}
