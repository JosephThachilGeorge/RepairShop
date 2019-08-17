package model;


import java.util.HashMap;

public class Customer {

    private  String cusname;
    private String cusnumber;


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

    public HashMap<String, String> customer = new HashMap<>();

    public void addInMap(String cusname, String cusnumber) {

        if (customer == null) {
            customer = new HashMap<String, String>();
            customer.put(cusname, cusnumber);

            return;
        }
    }}

