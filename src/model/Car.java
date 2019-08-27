package model;

import logic.Service;

import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Car implements Service {

    public String carname;
    public String carmodel;
    public String description;


    public String getCarname() {
        return carname;
    }


    public String getDescription() {
        return description;
    }

    public String getCarmodel() {
        return carmodel;
    }


    public void setCarname(String carname) {
        this.carname = carname;
    }

    public void setCarmodel(String carmodel) {
        this.carmodel = carmodel;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public Void calculatecost() {

        int mancost = 25;
        int hours = 2;
        int tax = 2;
        int total = (mancost * hours) * (tax);

        System.out.println("The Cost for Car Service is: " + total + " Euro");

        return null;
    }

    @Override
    public Void display() {

        System.out.println("Car will be delivered with in two days!");
        return null;
    }

    @Override
    public Void expecteddeliverydate() {

        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.DAY_OF_YEAR, 2);
        Date tomorrow = calendar.getTime();
        System.out.println("Expected Delivery Date and Time is:" + tomorrow);
        return null;
    }

    @Override
    public Void discount() {

        Scanner myObj = new Scanner(System.in);

        System.out.println("Is it your first service: Type YES or NO: \n ");
        String b = myObj.next();

        if (b.equalsIgnoreCase("yes")) {

            System.out.println("CONGRATULATION ! YOU HAVE 30 PERCENTAGE DISCOUNT FROM TOTAL BILL !");
            System.out.println("After Discount the AMOUNT is: 60 Euro");


        } else if (b.equalsIgnoreCase("no")) {

            System.out.println("NO DISCOUNT!");
        }

        return null;
    }


}

