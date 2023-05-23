package org.example;
import java.util.Date;
public class Game extends Item {
    private String publisher;
    private String platform;

    public Game(String title, String genre, int id, Date releaseDate, boolean available
            ,String platform , String publisher) {
        super(title, genre, id);
        this.platform=platform;
        this.publisher=platform;
    }


}

