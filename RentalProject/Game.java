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
    public void add(Game game)
    {
        ListOfObj.add(game);
    }
    public void remove(Game game)
    {
        ListOfObj.remove(game);
    }
    public Double rentalFee()
    {
        return 10.5;
    }

}

