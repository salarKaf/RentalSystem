package org.example;
    import java.util.ArrayList;
    import java.util.Scanner;
    
    public class Customer {
        private int id;
        private String name;
        private String email;
        private long phoneNumber;
        private String address;
//        private ArrayList<Integer> idList=new ArrayList<>();
        private ArrayList<Rental> rentals;
    
        public ArrayList<Rental> getRentList() {
            if (rentals==null){
                rentals = new ArrayList<Rental>();
            }
            return rentals;
        }

        public Customer(String name, String email, long phoneNumber, String address, int id) {
            this.id=id;
            // boolean flag;
            // do{
            //     flag=false;
            //     for(int i=0 ; i<idList.size() ; i++)
            //     {
            //         if(idList.get(i)==id)
            //         {
            //             flag=true;
            //             break;
            //         }
            //     }
            //     if(!flag)
            //         idList.add(id);
            //     else
            //     {
            //         System.out.println("Enter another id!");
            //         Scanner scanner=new Scanner(System.in);
            //         this.id=scanner.nextInt();
            //     }
    
            // }while (flag);
    
            this.name = name;
            this.email = email;
            this.phoneNumber = phoneNumber;
            this.address = address;
            this.rentals=new ArrayList<>();

        }
    
        public String getName() {
            return name;
        }
    
        public String getEmail() {
            return email;
        }

        public void setId(int id) {
            this.id = id;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public void setPhoneNumber(long phoneNumber) {
            this.phoneNumber = phoneNumber;
        }

        public void setAddress(String address) {
            this.address = address;
        }

        public void setRentList(ArrayList<Rental> rentals) {
            this.rentals = rentals;
        }

        public long getPhoneNumber() {
            return phoneNumber;
        }
    
        public String getAddress() {
            return address;
        }
        public int getId() {
            return id;
        }
    
    }
    

