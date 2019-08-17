package database;

import model.Customer;
import sun.java2d.loops.CustomComponent;

import java.util.*;

public class CUSTdatabase {


        //Scanner in = new Scanner(System.in);

        HashMap<String, String> customer = new HashMap<>();

        public void addInMap(String cusname, String cusnumber) {

                if (customer == null) {
                        customer = new HashMap<String, String>();
                        customer.put(cusname, cusnumber);


                }
        }
}







