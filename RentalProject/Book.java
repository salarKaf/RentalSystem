import java.util.Date;

public class Book extends Item {
    private String author;

    public Book(String author, boolean available,String title, String genre , int  id, Date releaseDate ,RentalStore rentalStore) {
        super(title,genre ,id ,rentalStore);
        this.author = author;
    }


    public Double rentalFee() {
        return 7.5;
    }
    public void add(Book book)
    {
        ListOfObj.add(book);
    }
    public void remove(Book book)
    {
        ListOfObj.remove(book);
    }

}
