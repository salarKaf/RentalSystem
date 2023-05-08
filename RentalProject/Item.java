 import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public abstract class Item {
    public String title;
    public String genre;
    public Date releaseDate;
    public int id;
    public boolean available;
    public ArrayList<Integer> ListOfId=new ArrayList<>();
    public ArrayList<Item> ListOfObj=new ArrayList<>();
    public Item(String title, String genre , int id) {
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
}