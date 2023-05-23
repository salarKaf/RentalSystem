package org.example;
import java.util.Date;

public class Book extends Item {
    private String writer;

    public Book(String writer, boolean available,String title, String genre , int  id, Date releaseDate) {
        super(title,genre ,id);
        this.writer = writer;
    }




}
