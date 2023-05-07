import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Date;

public class Rental {
    private int id;
    private Movie movie;
    private Customer customer;
    private Date rentalData;
    private  Date returnDate;
    public Rental( Movie movie, Customer customer) {
        this.movie = movie;
        this.customer = customer;
        rentalData=new Date();
        id=movie.getId()+customer.getId();
    }

    public void setReturnDate(Date returnDate) {

        this.returnDate = returnDate;
    }

    public int getId() {

        return id;
    }

    public Movie getMovie() {

        return movie;
    }

    public Customer getCustomer() {

        return customer;
    }

    public Date getRentalData() {
        return rentalData;
    }

    public Date getReturnDate() {
        return returnDate;
    }
    public Double calculateLateFee()
    {
        Double lateFee=0.0;
        LocalDate date1 = LocalDate.of(getRentalData().getYear(), getRentalData().getMonth() , getRentalData().getDay());
        LocalDate date2 = LocalDate.of( getReturnDate().getYear(), getReturnDate().getMonth() ,getReturnDate().getDay() );

        long late = ChronoUnit.DAYS.between(date1, date2);
        if(late>14)
        {
            lateFee =late*4.5;
        }
        return lateFee;
    }
}