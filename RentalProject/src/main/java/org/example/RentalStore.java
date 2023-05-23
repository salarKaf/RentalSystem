
package org.example;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;
public class RentalStore {
    private ArrayList<Customer> ListOfCustumer;
    private ArrayList<Item> ListOfItem;

    public RentalStore() {
        ListOfItem=new ArrayList<>();
        ListOfCustumer=new ArrayList<>();
    }
    public void register(Customer customer)
    {
        boolean check=false;
        for (int t=0 ; t<ListOfCustumer.size() ; t++)
        {
            if(ListOfCustumer.get(t).getId()==customer.getId())
            {
                check=true;
                break;
            }
        }
        if(!check)
        {
            ListOfCustumer.add(customer);

        }

    }
    public void rentItem(Item item , Customer customer) {
        if (!item.available){
            return;
        }
                Rental rental = new Rental(item, customer.getId());
                customer.getRentList().add(rental);
    }
    public ArrayList GetItemAvailable()
    {
        ArrayList<Item> itemAvailable=new ArrayList<>();
        for (Item i : ListOfItem)
        {
            if(i.available==true)
            {
                itemAvailable.add(i);
            }
        }
        return itemAvailable;
    }
    public void returnItem(Rental rental) {
        Date date=new Date();
        rental.setReturnDate(date);
            rental.getItem().available=true;
            remove(rental.getItem());

    }
    public Customer getCustomerById(int id)
    {
        for (Customer c : ListOfCustumer)
        {
            if(id==c.getId())
            {
                return c;
            }
        }
        return null;
    }
    public Item getItemById(int id)
    {
        for (Item c : ListOfItem)
        {
            if(id==c.id)
            {
                return c;
            }
        }
        return null;
    }
    public void remove(Item item)
    {
        ListOfItem.remove(item);
    }
    public void add(Item item)
    {
        ListOfItem.add(item);
    }

}


