package com.solvd.shop.articles;
import com.solvd.shop.interfaces.Author;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Books extends Products implements Author {

    private static final Logger LOG = LogManager.getLogger("");

    private String book;

    public Books() {
    }
    public Books(String name, double costUnit, int cantStock,
                  boolean available, String Author) {
        super(name, costUnit, cantStock, available);
        this.book = book;
    }
    @Override
    public String toString() {
        return "BOOK ARTICLES\n" + super.toString() + "Book: "
                + this.book;
    }

    public String getBook() {
        return book;
    }

    public void setBook(String book) {
        this.book = book;
    }

    @Override
    public String nameAutohors(String name) {
        return name;
    }

    @Override
    public String sayHello(String greeting) {
        return null;
    }
}


