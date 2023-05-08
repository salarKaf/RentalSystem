import java.util.ArrayList;
import java.util.Scanner;

public class Customer {
    private int id;
    private String name;
    private String email;
    private String phoneNumber;
    private String address;
    private ArrayList<Integer> idList=new ArrayList<>();
    private ArrayList<String> rentList;

    public Customer(String name, String email, String phoneNumber, String address, int id) {
        this.id=id;
        boolean flag;
        do{
            flag=false;
            for(int i=0 ; i<idList.size() ; i++)
            {
                if(idList.get(i)==id)
                {
                    flag=true;
                    break;
                }
            }
            if(!flag)
                idList.add(id);
            else
            {
                System.out.println("Enter another id!");
                Scanner scanner=new Scanner(System.in);
                this.id=scanner.nextInt();
            }

        }while (flag);

        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getAddress() {
        return address;
    }
    public int getId() {
        return id;
    }

}
