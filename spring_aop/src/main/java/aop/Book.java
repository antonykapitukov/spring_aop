package aop;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("bookBean")
public class Book {
    @Value("Преступление и наказание")
    private String title;

    @Value("Достоевский")
    private String author;

    @Value("1886")
    private int year;

    public int getYear() {
        return year;
    }

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }
}
