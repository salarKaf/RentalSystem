package org.example;
import java.util.ArrayList;
 import java.util.Date;
 import java.util.Scanner;
public class Item {
    public String title;
    public String genre;
    public Date releaseDate;
    public int id;
    public boolean available;
//    public RentalStore rentalStore;


    public Item(String title, String genre , int id ) {
        this.id = id;
        this.title = title;
        this.genre = genre;
        releaseDate=new Date();
        this.available=true;


    }
    public void remove(Item item, RentalStore rentalStore)
    {

        rentalStore.remove(item);
    }
    public void add(Item item , RentalStore rentalStore)
    {
        rentalStore.add(item);
    }
    public void rentItem(Customer customer ,RentalStore rentalStore)
    {
        rentalStore.rentItem(this, customer);
    }
    public void returnItem(Customer customer  , RentalStore rentalStore)
    {
        for(int i=0 ; i<customer.getRentList().size() ; i++)
        {
            if(customer.getRentList().get(i).getItem().getId()==this.id)
            {
                rentalStore.returnItem(customer.getRentList().get(i));
                break;
            }
        }
        
    }
    public int getId() {
        return id;
    }



}