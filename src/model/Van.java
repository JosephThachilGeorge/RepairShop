package model;

import logic.Service;

import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Van implements Service {          //created class van with 3 instance varriabele.

    public String vanname;
    public String vanmodel;
    public String vandescription;


    public String getVanname() {
        return vanname;
    }


    public String getVandescription() {
        return vandescription;
    }

    public String getVanmodel() {
        return vanmodel;
    }


    public void setVanname(String name) {
        this.vanname = name;

    }

    public void setVanmodel(String model) {
        this.vanmodel = model;
    }

    public void setVandescription(String description) {
        this.vandescription = description;
    }



    @Override
    public Void display() {
        System.out.println("Your Van will be delivered with in two days!"); //Overide interface method
        return null;
    }

    @Override
    public Void calculatecost() { //Overide interface method

        int mancost =40;
        int hours=4;
        int tax=40;
        int total=(mancost*hours)+(tax);

        System.out.println("The Cost for Van Service is: "+ total+" Euro");
        return null;
    }

    @Override
    public Void expecteddeliverydate() { //Overide interface method

        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.DAY_OF_YEAR, 2);
        Date tomorrow = calendar.getTime();
        System.out.println("Expected Delivery Date and Time is:"+ tomorrow);
        return null;


    }

    @Override
    public Void discount() { //Overide interface method

        Scanner myObj = new Scanner(System.in);

        System.out.println("Is it your first service: Type YES or NO: \n ");
        String b = myObj.next();

        if (b.equalsIgnoreCase("yes")) {

            System.out.println("CONGRATULATION ! YOU HAVE 20 PERCENTAGE DISCOUNT FROM TOTAL BILL !");
            System.out.println("After Discount the AMOUNT is: 160 Euro");


        } else if (b.equalsIgnoreCase("no")) {

            System.out.println("NO DISCOUNT!");}

        return null;
    }


}
