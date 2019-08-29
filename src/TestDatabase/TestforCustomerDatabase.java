package TestDatabase;

import database.DatabaseClass;
import model.Customer;

import java.util.Map;
import java.util.Scanner;

public class TestforCustomerDatabase extends Customer {

    public static void objectcreationForCarDeletion() {

        DatabaseClass myDatabse = new DatabaseClass();  // create object for Database class

        Scanner commandLineScanner = new Scanner(System.in);
        System.out.println("Welcome To Customer Database!");
        System.out.println("How many customer you would like to add in the Database:");

        int num=commandLineScanner.nextInt();
        commandLineScanner.nextLine();
        for(int i = 0; i<num; i++ ){

            Customer customer = new Customer();            // create object for Customer class

            System.out.println("Enter Customer Name:");
            String cusname = commandLineScanner.nextLine();

            System.out.println("Enter Customer ID:");
            String cusnumber = commandLineScanner.nextLine();

            customer.setCusnumber(cusnumber);        //Input value set using setCustomer method
            customer.setCusname(cusname);
            myDatabse.addCustomer(customer);
        }

        System.out.println("Present Data Base is !");

        Map<String, Customer> customerData = myDatabse.getCustomerData();
        for (String key : customerData.keySet()) {
            Customer c = customerData.get(key);
            System.out.println(String.format("Customer Name: %s, Customer ID: %s", c.getCusname(), c.getCusnumber()));// printing carname name and carnumber
        }

        System.out.println("Enter customer ID that you want to delete: ");

        String modelNumberToDelete = commandLineScanner.nextLine();

        myDatabse.deleteCustomerByModelNumber(modelNumberToDelete);

        System.out.println("Selected Customer is deleted!");

        System.out.println("Updated Database is!");
        for (String key : customerData.keySet()) {
            Customer c = customerData.get(key);
            System.out.println(String.format("Customer Name: %s, Customer ID: %s", c.getCusname(), c.getCusnumber()));
        }
    }
    public static void objectcreationForCarUpdate() {

        DatabaseClass myDatabse = new DatabaseClass();
        Scanner commandLineScanner = new Scanner(System.in);
        System.out.println("Welcome To Customer Database!");
        System.out.println("How many customer you would like to add in the Database:");

        int num=commandLineScanner.nextInt();
        commandLineScanner.nextLine();

        for(int i = 0; i<num; i++ ){
            Customer customer = new Customer();            // create object for Customer class
            System.out.println("Enter Customer Name:");
            String cusname = commandLineScanner.nextLine();
            System.out.println("Enter Customer ID:");
            String cusnumber = commandLineScanner.nextLine();

            customer.setCusnumber(cusnumber);        //Input value set using setCustomer method
            customer.setCusname(cusname);
            myDatabse.addCustomer(customer);
        }

        System.out.println("Existing Database!");

        Map<String, Customer> customerData=myDatabse.getCustomerData();

        for(String key:customerData.keySet()){
            Customer c=customerData.get(key);
            System.out.println(String.format("Customer name: %s, Customer ID: %s", c.getCusname(), c.getCusnumber()));
        }
        Customer customer = new Customer();

        System.out.println("Enter the Customer ID that that you want to Update:");
        String cusnumber = commandLineScanner.nextLine();
        System.out.println("Enter the new Customer name that you want to add in the Database ");
        String cusname = commandLineScanner.nextLine();

        if (myDatabse.getCustomerData().containsKey(cusnumber))
        {
            customer.setCusname(cusname);
            customer.setCusnumber(cusnumber);
            myDatabse.updateCustomer(customer);
        }

        Customer customerInMap = myDatabse.getCustomerData().get(cusnumber);
        if(customerInMap != null){
            customerInMap.setCusname(cusname);
            myDatabse.updateCustomer(customerInMap);
        }

        System.out.println("Updated Database:");

        for (String key : customerData.keySet()) { // using for loop checking the key
            Customer c = customerData.get(key);
            System.out.println(String.format("Customer Name: %s, Customer ID: %s", c.getCusname(), c.getCusnumber()));// printing carname name and carnumber
        }
    }

    public static void main(String[] args) {
          //  objectcreationForCarDeletion();

         //  objectcreationForCarUpdate();

    }
}



