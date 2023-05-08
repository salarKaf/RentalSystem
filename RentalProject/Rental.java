
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Date;

public class Rental {
    private int id;
    private Item item;
    private Customer customer;
    private Date rentalData;
    private  Date returnDate;
    public Rental( Item item, Customer customer) {
        this.item = item;
        this.customer = customer;
        rentalData=new Date();
        id=item.id+customer.getId();
    }

    public void setReturnDate(Date returnDate) {

        this.returnDate = returnDate;
    }

    public int getId() {

        return id;
    }

    public Item getItem() {

        return item;
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

