package model;
//import database.CUSTdatabase;
import database.DatabaseClass;
        import model.Car;
import model.Customer;
import model.Moterbike;
import model.Van;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;

public class MainClass {

    public static void main(String[] args) {


        System.out.println("WELCOME TO SERVICE CENTER ");

        DatabaseClass myDatabse = new DatabaseClass();  // create object for Database class

        Customer customer = new Customer();            // create object for Customer class
        Scanner commandLineScanner = new Scanner(System.in);

        System.out.println("Enter Customer name:");
        String cusname = commandLineScanner.nextLine();

        System.out.println("Enter Customer ID:");
        String cusnumber = commandLineScanner.nextLine();

        customer.setCusnumber(cusnumber);        //Input value set using setCustomer method
        customer.setCusname(cusname);            //Input value set using setCustomer method


         myDatabse.addCustomer(customer);  // value stored in Customer database using addCustomer method.

        System.out.println("Your Name is: " + customer.getCusname() + "\n" + "Your ID is  : " + customer.getCusnumber());
        System.out.println("**************************");       // displaying customer name and number


        System.out.println("THIS SERVICE CENTER HAS BELOW SERVICES:" + "\n" + "************************************" + "\n" + "1. CAR SERVICE" + "\n" + "2. MOTERBIKE SERVICE" + "\n" + "3. VAN SERVICE" + "\n" + "4. HISTORY" + "\n" + "5. EXIT" + "\n" + "************************************" + "\n" + "\n" +
                "PLEASE ENTER YOUR OPTION:");

        int option;
        do {


            option = commandLineScanner.nextInt();

            switch (option) {
                case 1:
                    System.out.println("WELCOME TO CAR SERVICE!" + "\n" + "-----------------------");


                    Car car = new Car();     //create object for Car class
                    System.out.println("Enter Car Name:");

                    commandLineScanner.nextLine();
                    String carname = commandLineScanner.nextLine();

                    System.out.println("Enter Car Model number:");
                    String carmodel = commandLineScanner.nextLine();
                    System.out.println("Problem Description:");
                    String descriptioncar = commandLineScanner.nextLine();


                    car.setCarname(carname);  // values of car stored using setmethod
                    car.setCarmodel(carmodel);
                    car.setDescription(descriptioncar);

                    myDatabse.addCar(car); // Values of car is stored in database


                    System.out.println("Record Stored!");

                    System.out.println("Service Entry Recorded on:");
                    DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss" + "\n" + "***********************"); // display system date
                    Date date = new Date();
                    System.out.println(dateFormat.format(date));


                    Car objcarservice = new Car(); //object created for Interface
                    objcarservice.discount(); // using interface object calling method
                    objcarservice.calculatecost(); // using interface object calling method
                    objcarservice.display(); // using interface object calling method
                    objcarservice.expecteddeliverydate(); // using interface object calling method

                    break;

                case 2:
                    System.out.println("WELCOME TO MOTERBIKE SERVICE!" + "\n" + "-----------------------");
                    Moterbike moter = new Moterbike(); //create object for Moterbike class

                    System.out.println("Enter Moterbike Name:");

                    commandLineScanner.nextLine();
                    String moterbikename = commandLineScanner.nextLine();

                    System.out.println("Enter Moterbike Model number :");
                    String moterbikemodel = commandLineScanner.nextLine();

                    System.out.println("Problem Description:");
                    String descriptionmoter = commandLineScanner.nextLine();


                    moter.setMoterbikeName(moterbikename); // values of moterbike stored using setmethod
                    moter.setMoterbikeModel(moterbikemodel); // values of moterbike stored using setmethod
                    moter.setDescription(descriptionmoter); // values of moterbike stored using setmethod

                    myDatabse.addMoterbike(moter); // Values of moterbike is stored in database


                    System.out.println("Record Stored!");
                    System.out.println("Service Entry Recorded on:");
                    DateFormat dateFormat1 = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss" + "\n" + "***********************"); // display system date
                    Date date2 = new Date();
                    System.out.println(dateFormat1.format(date2));


                    Moterbike objmotservice = new Moterbike();  //object created for Interface

                    objmotservice.discount(); // using interface object calling method
                    objmotservice.calculatecost(); // using interface object calling method
                    objmotservice.display(); // using interface object calling method
                    objmotservice.expecteddeliverydate(); // using interface object calling method

                    break;

                case 3:

                    System.out.println("WELCOME TO VAN SERVICE!" + "\n" + "-----------------------");
                    System.out.println("Enter Van Name:");

                    commandLineScanner.nextLine();
                    String vanname = commandLineScanner.nextLine();


                    System.out.println("Enter Van Model number :");
                    String vanmodel = commandLineScanner.nextLine();

                    System.out.println("Problem Description");
                    String descriptionvan = commandLineScanner.nextLine();


                    Van van = new Van(); //create object for Van class
                    van.setVanname(vanname); // values of Van stored using setmethod
                    van.setVanmodel(vanmodel); // values of Van stored using setmethod
                    van.setVandescription(descriptionvan); // values of Van stored using setmethod


                    myDatabse.addVan(van); // Values of Van is stored in database
                    //myDatabse.deleteVan(van); This is for deleting data base


                    System.out.println("Service Entry Recorded on:");
                    DateFormat dateFormat2 = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss" + "\n" + "***********************"); // display system date
                    Date date3 = new Date();
                    System.out.println(dateFormat2.format(date3));


                    Van objvanservice = new Van(); // using interface object calling method
                    objvanservice.discount(); // using interface object calling method
                    objvanservice.calculatecost(); // using interface object calling method
                    objvanservice.display(); // using interface object calling method
                    objvanservice.expecteddeliverydate(); // using interface object calling method

                    break;

                case 4:

                    //History is for displaying data from Hashmap

                    System.out.println("CUSTOMER DATA HISTORY " + "\n" + "-----------------------");

                    Map<String, Customer> customerData = myDatabse.getCustomerData();  // for printing coustomer name and custnumber
                    for ( String key : customerData.keySet()){   // using for loop checking the the key
                        Customer d = customerData.get(key);
                        System.out.println(String.format("Customer name: %s, Customer number: %s", d.getCusname(), d.getCusnumber()));

                    }


                    Map<String, Car> carData=myDatabse.getCarData(); // for printing carname name and carnumber
                    for(String key: carData.keySet()){ // using for loop checking the key
                        Car c=carData.get(key);
                        System.out.println(String.format("Car name: %s, Car Model number: %s", c.getCarname(), c.getCarmodel()));// printing carname name and carnumber
                    }

                    Map<String,Moterbike> moterbikeData=myDatabse.getMoterbikepData();

                    for(String key: moterbikeData.keySet()){
                        Moterbike m = moterbikeData.get(key);
                        System.out.println(String.format("Moterbike name: %s,  Moterbike Model number: %s", m.getMoterbikeName(), m.getMoterbikeModel()));

                        }

                    Map<String,Van> vanData=myDatabse.getVanData();

                    for(String key: vanData.keySet()){
                        Van v=vanData.get(key);
                        System.out.println(String.format("Van name: %s, Van model number: %s", v.getVanname(), v.getVanmodel()));
                    }



                    break;


                case 5:

                    System.out.println("Thank You for Using our Service!");

                    break;

            }


            System.out.println("Would you like to add a new CUSTOMER?  Type YES or NO: ");
            String b = commandLineScanner.next();


            if (b.equalsIgnoreCase("yes")) {

                System.out.println("THIS SERVICE CENTER HAS BELOW SERVICES:" + "\n" + "************************************" + "\n" + "1. CAR SERVICE" + "\n" + "2. MOTERBIKE SERVICE" + "\n" + "3. VAN SERVICE" + "\n" + "4. HISTORY" + "\n" + "5. EXIT" + "\n" + "************************************" + "\n" + "\n" +
                        "PLEASE ENTER YOUR OPTION:");


            } else if (b.equalsIgnoreCase("no")) {

                System.out.println("Thank You for Using our Service!");}
            }

            while (option != 5) ;


        }

    }



