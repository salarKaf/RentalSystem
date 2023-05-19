
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
                System.out.println("You are already a member of the RentalSystem!");
                check=true;
                break;
            }
        }
        if(!check)
        {
            ListOfCustumer.add(customer);
            System.out.println("You are registered in the RentalSystem.");
        }

    }
    public void rentItem(Item item , Customer customer) {
        int save = 0;
        boolean check = false;
        boolean check1 = false;
        for (Customer c : ListOfCustumer) {
            if (c.getId() == customer.getId()) {
                check = true;
                break;
            }
        }
        if (!check) {
            String answer;
            System.out.println("You are not registered in the Rental system");
            System.out.println("Do you want to register in the Rental system?Y/N");
            Scanner scanner = new Scanner(System.in);
            answer = scanner.nextLine();
            if (answer == "Y" || answer == "y") {
                register(customer);
            } else {
                System.out.println("To rent, you must first register in the library");
            }
        } else {
            ArrayList<Item> itemAvailable = GetItemAvailable();
            for (int i = 0; i < itemAvailable.size(); i++) {
                if (itemAvailable.get(i).id == item.id) {
                    save = i;
                    check1 = true;
                    break;
                }
            }
        }
        if (!check1) {
            System.out.println("This item has already been rented!");
        } else {
            Double fee = item.rentalFee();
            System.out.println("The rental fee is " + fee);
            System.out.println("Enter 1 to pay");
            Scanner scanner = new Scanner(System.in);
            int a = scanner.nextInt();
            if (a == 1) {
                System.out.println("payed!");
                ListOfItem.get(save).available = false;
                Rental rental = new Rental(item, customer);
                System.out.println("It was rented successfully!");
            }
        }
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
        double fee=rental.calculateLateFee();
        if(fee==0.0)
        {
            System.out.println("Item returned!");
            rental.getItem().available=true;
        }
        else
        {
            System.out.println("Your late fee is" +fee+ "Pay it first.");
            System.out.println("Enter 1 to pay");
            Scanner scanner=new Scanner(System.in);
            int a=scanner.nextInt();
            if(a==1)
            {
                System.out.println("payed!");
                rental.getItem().available=true;
                System.out.println(".......Item returned!");
            }
        }
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


