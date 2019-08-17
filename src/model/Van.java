package model;

import logic.Service;

import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Scanner;

public class Van implements Service {

    private String name;
    private String model;
    private String description;




    public String getName() {
        return name;
    }



    public String getDescription() {
        return description;
    }

    public String getModel() {
        return model;
    }



    public void setName(String name) {
        this.name = name;

    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setDescription(String description) {
        this.description = description;
    }



    @Override
    public Void display() {
        System.out.println("Your Van will be delivered with in two days!");
        return null;
    }

    @Override
    public Void calculatecost() {

        int mancost =40;
        int hours=4;
        int tax=40;
        int total=(mancost*hours)+(tax);

        System.out.println("The Cost for Van Service is: "+ total+" Euro");
        return null;
    }

    @Override
    public Void expecteddeliverydate() {

        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.DAY_OF_YEAR, 2);
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

            System.out.println("CONGRATULATION ! YOU HAVE 20 PERCENTAGE DISCOUNT FROM TOTAL BILL !");
            System.out.println("After Discount the AMOUNT is: 160 Euro");


        } else if (b.equalsIgnoreCase("no")) {

            System.out.println("NO DISCOUNT!");}

        return null;
    }

    public HashMap<String, String> vandata = new HashMap<>();

    public void addInMap(String name, String model) {

        if (vandata == null) {
            vandata = new HashMap<String, String>();
            vandata.put(name, model);

            return;

        }
}}
