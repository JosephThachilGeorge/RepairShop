package model;

import database.ComplexObject;
import logic.Service;

import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Scanner;

public class Moterbike implements Service {

    public String moterbikename;
    public String moterbikemodel;
    public String description;




    public String getName() {
        return moterbikename;
    }



    public String getDescription() {
        return description;
    }

    public String getModel() {
        return moterbikemodel;
    }



    public void setName(String moterbikename) {
        this.moterbikename = moterbikename;

    }

    public void setModel(String moterbikemodel) {
        this.moterbikemodel = moterbikemodel;
    }

    public void setDescription(String description) {
        this.description = description;
    }



    @Override
    public Void display() {

        System.out.println("Your MoterBike will be delivered with in one day!");
        return null;
    }

    @Override
    public Void calculatecost() {

        int mancost =20;
        int hours=2;
        int tax=10;
        int total=(mancost*hours)+(tax);

        System.out.println("The Cost for MoterBike Service is: "+ total+" Euro");
        return null;
    }

    @Override
    public Void expecteddeliverydate() {

        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.DAY_OF_YEAR, 1);
        Date tomorrow = calendar.getTime();
        System.out.println("Expected Delivery Date and Time is:"+ tomorrow);
        return null;

    }

    @Override
    public Void discount() {

        Scanner myObj = new Scanner(System.in);

        System.out.println("Is it your first service: Type YES or NO: \n ");
        String b = myObj.next();

        if (b.equalsIgnoreCase("yes")) {

            System.out.println("CONGRATULATION ! YOU HAVE 50 PERCENTAGE DISCOUNT FROM TOTAL BILL !");
            System.out.println("After Discount the AMOUNT is: 25 Euro");


        } else if (b.equalsIgnoreCase("no")) {

            System.out.println("NO DISCOUNT!");}

        return null;
    }

    HashMap<String, ComplexObject> Moterbikeinformation = new HashMap<String, ComplexObject>();

    public void addInMap (String moterbikename, ComplexObject moterbikemodel) {

        if (Moterbikeinformation == null) {

            Moterbikeinformation = new HashMap<String, ComplexObject>();

        }

        Moterbikeinformation.put(moterbikename,moterbikemodel);


    }


    public HashMap<String, ComplexObject> getMoterbikeinformation() {
        return Moterbikeinformation;
    }

}