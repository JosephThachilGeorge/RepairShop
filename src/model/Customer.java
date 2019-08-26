package model;


import database.CUSTdatabase;
import database.ComplexObject;

import java.util.HashMap;

public class Customer {

    public String cusname;
    public String cusnumber;


    public String getCusname() {
        return cusname;
    }

    public void setCusnumber(String cusnumber) {
        this.cusnumber = cusnumber;

    }

    public void setCusname(String cusname) {
        this.cusname = cusname;
    }

    public String getCusnumber() {
        return cusnumber;
    }


    HashMap<String, ComplexObject> customer = new HashMap<String, ComplexObject>();

    public void addInMap (String cusnumber, ComplexObject cusname) {

        if (customer == null) {

            customer = new HashMap<String, ComplexObject>();

                            }

        customer.put(cusnumber,cusname);


    }


    public HashMap<String, ComplexObject> getCustomer() {
        return customer;
    }

}

