package org.example;
import java.util.ArrayList;
 import java.util.Date;
 import java.util.Scanner;
public abstract class Item {
    public String title;
    public String genre;
    public Date releaseDate;
    public int id;
    public int getId() {
        return id;
    }
    public boolean available;
    public ArrayList<Integer> ListOfId=new ArrayList<>();
    public ArrayList<Item> ListOfObj=new ArrayList<>();
    private RentalStore rentalStore;
    public Item(String title, String genre , int id, RentalStore rentalStore) {
        this.rentalStore=rentalStore;
        this.id = id;
        // boolean flag;
        // do {
        //     flag = false;
        //     for (int i = 0; i < ListOfId.size(); i++)
        //     {
        //         if (ListOfId.get(i) == id) {
        //             flag = true;
        //             break;
        //         }
        //     }
        //     if (!flag)
        //     {
        //         ListOfId.add(id);
        //     }
        //     else
        //         {
        //             System.out.println("Enter another id!");
        //             Scanner scanner = new Scanner(System.in);
        //             this.id = scanner.nextInt();
        //         }

        //     }while (flag);

        this.title = title;
        this.genre = genre;
        releaseDate=new Date();
        this.available=true;
    }
    abstract public Double rentalFee();
    public void remove(Item item)
    {
        ListOfObj.remove(item);
    }
    public void add(Item item)
    {
        ListOfObj.add(item);
    }
    public void rentItem(Customer customer)
    {
        rentalStore.rentItem(this, customer);
    }
    public void returnItem(Customer customer)
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

}