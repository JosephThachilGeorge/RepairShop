
import com.sun.xml.internal.ws.api.message.HeaderList;
//import database.CUSTdatabase;
import logic.Service;
import model.Car;
import model.Customer;
import model.Moterbike;
import model.Van;

import javax.xml.crypto.Data;
import java.sql.SQLOutput;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;

public class MainClass {

    public static void main(String[] args) {


        System.out.println("WELCOME TO SERVICE CENTER ");

        Customer obj = new Customer();



        Scanner myObj = new Scanner(System.in);

        System.out.println("Enter Customer name:");
        System.out.println("Enter Customer ID:");

        // String input
        String cusname = myObj.nextLine();
        String cusnumber = myObj.nextLine();


        obj.setCusnumber(cusnumber);
        obj.setCusname(cusname);
        obj.customer.put(cusname,cusnumber); //storing values in Hashmap

        System.out.println("Your Name is: " + obj.getCusname() + "\n" + "Your ID is  : " + obj.getCusnumber());
        System.out.println("**************************");



        System.out.println("THIS SERVICE CENTER HAS BELOW SERVICES:" + "\n" + "************************************" + "\n" + "1. CAR SERVICE" + "\n" + "2. MOTERBIKE SERVICE" + "\n" + "3. VAN SERVICE" + "\n" + "4. HISTORY" + "\n" + "5. EXIT" + "\n" + "************************************" + "\n" + "\n" +
                "PLEASE ENTER YOUR OPTION:");

        int option;
        do {


            option = myObj.nextInt();

            switch (option) {
                case 1:
                    System.out.println("WELCOME TO CAR SERVICE!" + "\n" + "-----------------------");


                    Car objcar = new Car();
                    System.out.println("Enter Car Name:");
                    System.out.println("Enter Car Model:");
                    System.out.println("Problem Description:");

                    String name = myObj.nextLine();
                    String model = myObj.nextLine();
                    String descriptioncar = myObj.nextLine();
                    String date1 = myObj.nextLine();

                    objcar.setName(name);
                    objcar.setModel(model);
                    objcar.setDescription(descriptioncar);



                   objcar.cardata.put(name,model); //storing values in Hashmap

                    System.out.println("Record Stored!"+"Name:"+objcar.cardata);

                    System.out.println("Service Entry Recorded on:");
                    DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss" + "\n" + "***********************");
                    Date date = new Date();
                    System.out.println(dateFormat.format(date));


                    Car objcarservice = new Car();
                    objcarservice.discount();
                    objcarservice.calculatecost();
                    objcarservice.display();
                    objcarservice.expecteddeliverydate();

                    break;

                case 2:
                    System.out.println("WELCOME TO MOTERBIKE SERVICE!" + "\n" + "-----------------------");
                    Moterbike objmoter = new Moterbike();
                    System.out.println("Enter Moterbike Name:");
                    System.out.println("Enter Moterbike Model :");
                    System.out.println("Problem Description:");
                    //System.out.println("Date of Service:");
                    String moterbikename = myObj.nextLine();
                    String moterbikemodel = myObj.nextLine();
                    String descriptionmoter = myObj.nextLine();
                    String datemoter = myObj.nextLine();

                    objmoter.setName(moterbikename);
                    objmoter.setModel(moterbikemodel);
                    objmoter.setDescription(descriptionmoter);

                    objmoter.moterdata.put(moterbikename,moterbikemodel);
                    System.out.println("Record Stored!"+objmoter.moterdata );

                    System.out.println("Service Entry Recorded on:");
                    DateFormat dateFormat1 = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss" + "\n" + "***********************");
                    Date date2 = new Date();
                    System.out.println(dateFormat1.format(date2));


                    Moterbike objmotservice = new Moterbike();

                    objmotservice.discount();
                    objmotservice.calculatecost();
                    objmotservice.display();
                    objmotservice.expecteddeliverydate();

                    break;

                case 3:
                    System.out.println("WELCOME TO VAN SERVICE!" + "\n" + "-----------------------");
                    Van objvan = new Van();
                    System.out.println("Enter Van Name:");
                    System.out.println("Enter Van Model :");
                    System.out.println("Problem Description");
                    // System.out.println("Date of Service:");
                    String vanname = myObj.nextLine();
                    String vanmodel = myObj.nextLine();
                    String descriptionvan = myObj.nextLine();
                    String datevan = myObj.nextLine();

                    objvan.setName(vanname);
                    objvan.setModel(vanmodel);
                    objvan.setDescription(descriptionvan);

                    objvan.vandata.put(vanname,vanmodel);
                    System.out.println("Record Stored!"+objvan.vandata);

                    System.out.println("Service Entry Recorded on:");
                    DateFormat dateFormat2 = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss" + "\n" + "***********************");
                    Date date3 = new Date();
                    System.out.println(dateFormat2.format(date3));

                    Van objvanservice = new Van();
                    objvanservice.discount();
                    objvanservice.calculatecost();
                    objvanservice.display();
                    objvanservice.expecteddeliverydate();


                    break;

                case 4:

                    System.out.println("CUSTOMER DATA HISTORY " + "\n" + "-----------------------");
                    System.out.println(obj.customer);
                    Car objcar1=new Car();
                    System.out.println(objcar1.cardata);
                    //System.out.println(objcar1.getModel());

                    break;


                case 5:
                    System.out.println("Thank You for Using our Service!");

                    break;

            }

            System.out.println("Would you like to add a new CUSTOMER?  Type YES or NO: ");
            String b = myObj.next();


            if (b.equalsIgnoreCase("yes")) {

                System.out.println("THIS SERVICE CENTER HAS BELOW SERVICES:" + "\n" + "************************************" + "\n" + "1. CAR SERVICE" + "\n" + "2. MOTERBIKE SERVICE" + "\n" + "3. VAN SERVICE" + "\n" + "4. HISTORY" + "\n" + "5. EXIT" + "\n" + "************************************" + "\n" + "\n" +
                        "PLEASE ENTER YOUR OPTION:");


            } else if (b.equalsIgnoreCase("no")) {

                System.out.println("Thank You for Using our Service!");}
            }

            while (option != 5) ;


        }

    }



