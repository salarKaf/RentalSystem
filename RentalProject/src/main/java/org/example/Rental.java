package org.example;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Date;

public class Rental {
    private int id;
    private Item item;
    private int customerId;
    private Date rentalData;
    private  Date returnDate;
    public Rental( Item item, int customerId) {
        this.item = item;
        this.customerId=customerId;
        rentalData=new Date();
        item.available=false;
        id=item.id+customerId;
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

    public int getCustomerId() {

        return customerId;
    }

    public Date getRentalData() {
        return rentalData;
    }

    public Date getReturnDate() {
        return returnDate;
    }
    public Double calculateLateFee(Rental rental)
    {
        Double lateFee=0.0;
        LocalDate date1 = LocalDate.of(rental.getRentalData().getYear(), getRentalData().getMonth() , getRentalData().getDay());
        LocalDate date2 = LocalDate.of( rental.getReturnDate().getYear(), getReturnDate().getMonth() ,getReturnDate().getDay() );

        long late = ChronoUnit.DAYS.between(date1, date2);
       if(late>14)
       {
          late=late-14;
          lateFee =late*4.5;
       }
       return lateFee;
    }
}

