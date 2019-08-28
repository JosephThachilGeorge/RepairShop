package TestDatabase;

import database.DatabaseClass;

import model.Car;

import java.util.Map;
import java.util.Scanner;


public class TestforCarDatabase extends Car {

    public static void objectcreationForCarDeletion() {

        DatabaseClass myDatabse = new DatabaseClass();
        Scanner commandLineScanner = new Scanner(System.in);

        Car car = new Car();
         car.setCarmodel("TataSmall");
         car.setCarname("Tataelxi");
         car.setDescription("This has wheel proplem");
         myDatabse.addCar(car);

        Car car1 = new Car();
        car1.setCarmodel("Tata1medium");
        car1.setCarname("Tataelxi");
        car1.setDescription("This has wheel proplem");
        myDatabse.addCar(car1);

        Car car2 = new Car();
        car2.setCarmodel("Tatalarge");
        car2.setCarname("Tataelxi");
        car2.setDescription("This has wheel proplem");
        myDatabse.addCar(car2);

        System.out.println("Existing Data Base!");
        Map<String, Car> carData = myDatabse.getCarData(); // for printing carname name and carnumber
        for (String key : carData.keySet()) { // using for loop checking the key
            Car c = carData.get(key);
            System.out.println(String.format("Car name: %s, Car Model number: %s", c.getCarname(), c.getCarmodel()));// printing carname name and carnumber

        }

        //Scanner commandLineScanner = new Scanner(System.in);

        System.out.println("Would you like to delete first row car Data?  Type YES or NO: ");

        String b = commandLineScanner.next();

        if (b.equalsIgnoreCase("yes")) {

            myDatabse.deleteCar(car);

            } else if (b.equalsIgnoreCase("no")) {

            System.out.println("Thank You");

        }

        if (!myDatabse.getCarData().containsKey(car.getCarmodel())) {
            System.out.println("Deleted Requested Car data:");
        }

        System.out.println("Updated Data Base!");
        for (String key : carData.keySet()) { // using for loop checking the key
            Car c = carData.get(key);
            System.out.println(String.format("Car name: %s, Car Model number: %s", c.getCarname(), c.getCarmodel()));// printing carname name and carnumber
        }

    }

    public static void objectcreationForCarUpdate() {

        DatabaseClass myDatabse1 = new DatabaseClass();

        Car car = new Car();
        car.setCarmodel("AltoSmall2");
        car.setCarname("Altolxi");
        car.setDescription("This has wheel proplem");

        myDatabse1.addCar(car);


        System.out.println("Existing Data Base!");

        Map<String, Car> carData = myDatabse1.getCarData(); // for printing carname name and carnumber
        for (String key : carData.keySet()) { // using for loop checking the key
            Car c = carData.get(key);
            System.out.println(String.format("Car name: %s, Car Model number: %s", c.getCarname(), c.getCarmodel()));// printing carname name and carnumber

        }
            Scanner commandLineScanner = new Scanner(System.in);

            System.out.println("Enter new name for a car:");
            String name = commandLineScanner.nextLine();

            car.setCarname(name);

            myDatabse1.updateCar(car);

            System.out.println("Updated Database:");

        for (String key : carData.keySet()) { // using for loop checking the key
            Car c = carData.get(key);
            System.out.println(String.format("Car name: %s, Car Model number: %s", c.getCarname(), c.getCarmodel()));// printing carname name and carnumber
        }
        }

    public static void main(String[] args) {

        objectcreationForCarDeletion();
        //objectcreationForCarUpdate();

    }
}