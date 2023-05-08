import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Movie {
    private String title;
    private String genre;
    private Date releaseDate;
    private int id;
    private boolean available;
    public ArrayList<Integer> ListOfId=new ArrayList<>();
    private ArrayList<Movie> ListOfObj=new ArrayList<>();
    private String director;
    private String cast;

    public Movie(String title, String genre, int id, String director, String cast) {
        this.id = id;
        boolean flag;
        do {
            flag = false;
            for (int i = 0; i < ListOfId.size(); i++)
            {
                if (ListOfId.get(i) == id) {
                    flag = true;
                    break;
                }
            }
            if (!flag)
            {
                ListOfId.add(id);
            }
            else
            {
                System.out.println("Enter another id!");
                Scanner scanner = new Scanner(System.in);
                this.id = scanner.nextInt();
            }

        }while (flag);

        this.title = title;
        this.genre = genre;
        releaseDate=new Date();
        this.available=true;
        this.director = director;
        this.cast = cast;
    }
    public String getDirector() {

        return director;
    }

    public String getCast() {
        return cast;
    }

    public boolean isAvailable() {

        return available;
    }
    public void setAvailable(boolean available) {

        this.available = available;
    }
    public String getTitle() {
        return title;
    }
    public int getId() {
        return id;
    }

    public String getGenre() {
        return genre;
    }

    public Date getReleaseDate() {
        return releaseDate;
    }

    public Double rentalFee()
    {
        return 5.5;
    }
    public void remove(Movie movie)
    {
        ListOfObj.remove(movie);
    }
    public void add(Movie movie)
    {
        ListOfObj.add(movie);
    }

}
