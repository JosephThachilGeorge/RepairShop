package TestDatabase;

import database.DatabaseClass;
import model.Customer;

import java.util.Map;
import java.util.Scanner;

public class TestforCustomerDatabase extends Customer {

    public static void objectcreationForCarDeletion() {

        DatabaseClass myDatabse = new DatabaseClass();  // create object for Database class

        Customer customer = new Customer();
        customer.setCusname("Joseph");
        customer.setCusnumber("4787878");
        myDatabse.addCustomer(customer);

        Customer customer1 = new Customer();
        customer1.setCusname("Jose");
        customer1.setCusnumber("4787338");
        myDatabse.addCustomer(customer1);

        Customer customer2 = new Customer();
        customer2.setCusname("Meghna");
        customer2.setCusnumber("4755548");
        myDatabse.addCustomer(customer2);

        System.out.println("Existing Data Base!");

        Map<String, Customer> customerData = myDatabse.getCustomerData();
        for (String key : customerData.keySet()) {
            Customer c = customerData.get(key);
            System.out.println(String.format("Customer name: %s, Customer Model number: %s", c.getCusname(), c.getCusnumber()));// printing carname name and carnumber
        }
        Scanner commandLineScanner = new Scanner(System.in);
        System.out.println("Enter customer id: ");

        String modelNumberToDelete = commandLineScanner.nextLine();

        myDatabse.deleteCustomerByModelNumber(modelNumberToDelete);

        System.out.println("Deleted Customer!");

        System.out.println("Updated Data Base!");
        for (String key : customerData.keySet()) {
            Customer c = customerData.get(key);
            System.out.println(String.format("Customer name: %s, Customer Model number: %s", c.getCusname(), c.getCusnumber()));
        }
    }
    public static void objectcreationForCarUpdate() {

        DatabaseClass updatedatabase=new DatabaseClass();

        Customer customer=new Customer();
        customer.setCusname("Joseph");
        customer.setCusnumber("4578");

        updatedatabase.addCustomer(customer);

        System.out.println("Existing Database!");

        Map<String, Customer> customerData=updatedatabase.getCustomerData();

        for(String key:customerData.keySet()){
            Customer c=customerData.get(key);
            System.out.println(String.format("Customer name: %s, Customer Model number: %s", c.getCusname(), c.getCusnumber()));
        }

        Scanner commandLineScanner = new Scanner(System.in);

        System.out.println("Enter new name for a Customer:");
        String name = commandLineScanner.nextLine();

        customer.setCusname(name);

        updatedatabase.updateCustomer(customer);

        System.out.println("Updated Database:");

        for (String key : customerData.keySet()) { // using for loop checking the key
            Customer c = customerData.get(key);
            System.out.println(String.format("Car name: %s, Car Model number: %s", c.getCusname(), c.getCusnumber()));// printing carname name and carnumber
        }
    }

    public static void main(String[] args) {
            //objectcreationForCarDeletion();

           //objectcreationForCarUpdate();

    }
}



