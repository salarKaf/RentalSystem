package org.example;

import java.io.*;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;

public class Main {
    public static void main(String[] args) throws IOException {
        Gson gson = new Gson(); // create a new Gson object
        Reader reader = new FileReader("C:\\Users\\pro\\Desktop\\Rental clone\\RentalSystem\\RentalProject\\src\\test\\TestYourFork.json"); // open the input file
        AllModules allModulesList=gson.fromJson(reader , new TypeToken<AllModules>() {
        }.getType());
        Customer Joshn=allModulesList.getCustomers().get(0);
        Customer Emily=allModulesList.getCustomers().get(1);
        Customer Brown=allModulesList.getCustomers().get(2);
        RentalStore rentalStore=new RentalStore();
        rentalStore.register(Joshn);
        for (Item tempitem : allModulesList.getBooks())
        {

            if(tempitem.id==3)
            {
                rentalStore.rentItem(tempitem , Joshn);

            }
            else if(tempitem.id==6)
            {
                rentalStore.rentItem(tempitem , Joshn);
            }
        }
        rentalStore.register(Emily);
        for (Item tempitem : allModulesList.getBooks())
        {

            if(tempitem.id==1)
            {
                rentalStore.rentItem(tempitem , Emily);
            }
            else if(tempitem.id==7)
            {
                rentalStore.rentItem(tempitem , Emily);
            }
        }


        rentalStore.register(Brown);
        for (Item tempitem : allModulesList.getBooks())
        {

            if(tempitem.id==9)
            {
                rentalStore.rentItem(tempitem , Brown);
            }
            else if(tempitem.id==4)
            {
                rentalStore.rentItem(tempitem , Brown);
            }
        }


        reader.close(); // close the input file

        Gson writing=new Gson();
        String json=writing.toJson(allModulesList);
        String filePath="C:\\Users\\pro\\Desktop\\Rental clone\\RentalSystem\\RentalProject\\src\\test\\TestYourFork.json";
        try {
            FileWriter writer=new FileWriter(filePath);
            writer.write(json);
            writer.close();
            System.out.println("Json Data has been update");

        }
        catch (IOException e)
        {
            e.printStackTrace();
        }


    }
}