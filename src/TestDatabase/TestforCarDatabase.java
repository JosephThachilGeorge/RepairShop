package TestDatabase;

import database.DatabaseClass;

import model.Car;

import java.util.Map;
import java.util.Scanner;


public class TestforCarDatabase extends Car {

    public static void objectcreationForCarDeletion() {

        DatabaseClass myDatabse = new DatabaseClass();

        Scanner commandLineScanner = new Scanner(System.in);
        System.out.println("Welcome To CAR Database!");
        System.out.println("How many car details you would like to add in the Database:");

        int num=commandLineScanner.nextInt();
        commandLineScanner.nextLine();
        for(int i = 0; i<num; i++ ){

            Car car = new Car();            // create object for Car class

            System.out.println("Enter CAR Name:");
            String carname = commandLineScanner.nextLine();

            System.out.println("Enter CAR Model Number:");
            String carmodel = commandLineScanner.nextLine();

            System.out.println("Enter CAR Problem Description:");
            String description=commandLineScanner.nextLine();

            car.setCarmodel(carmodel);        //Input value set using seCar method
            car.setCarname(carname);
            car.setDescription(description);
            myDatabse.addCar(car);
        }

        System.out.println("Existing Data Base!");
        Map<String, Car> carData = myDatabse.getCarData(); // for printing carname name and carnumber
        for (String key : carData.keySet()) { // using for loop checking the key
            Car c = carData.get(key);
            System.out.println(String.format("Car name: %s, Car Model number: %s,Car description: %s",  c.getCarname(), c.getCarmodel(),c.getDescription()));// printing carname name and carnumber

        }
        System.out.println("Enter CAR model number that you want to delete: ");

        String modelNumberToDelete = commandLineScanner.nextLine();

        myDatabse.deleteCarByModelNumber(modelNumberToDelete);

        System.out.println("Selected CAR is deleted!");

        System.out.println("Updated Database is!");
        for (String key : carData.keySet()) {
        Car c = carData.get(key);
        System.out.println(String.format("Car name: %s, Car Model number: %s,Car description: %s",  c.getCarname(), c.getCarmodel(),c.getDescription()));

        }

    }


    public static void objectcreationForCarUpdate() {

        DatabaseClass myDatabse = new DatabaseClass();

        Scanner commandLineScanner = new Scanner(System.in);
        System.out.println("Welcome To CAR Database!");
        System.out.println("How many car details you would like to add in the Database:");

        int num = commandLineScanner.nextInt();
        commandLineScanner.nextLine();
        for (int i = 0; i < num; i++) {

            Car car = new Car();            // create object for Car class

            System.out.println("Enter CAR Name:");
            String carname = commandLineScanner.nextLine();

            System.out.println("Enter CAR Model Number:");
            String carmodel = commandLineScanner.nextLine();

            System.out.println("Enter CAR Problem Description:");
            String description = commandLineScanner.nextLine();

            car.setCarmodel(carmodel);        //Input value set using seCar method
            car.setCarname(carname);
            car.setDescription(description);
            myDatabse.addCar(car);
        }

        System.out.println("Existing Data Base!");
        Map<String, Car> carData = myDatabse.getCarData(); // for printing carname name and carnumber
        for (String key : carData.keySet()) { // using for loop checking the key
            Car c = carData.get(key);
            System.out.println(String.format("Car name: %s, Car Model number: %s,Car description: %s", c.getCarname(), c.getCarmodel(), c.getDescription()));// printing carname name and carnumber

        }

        Car car = new Car();

        System.out.println("Enter the CAR model number that you want to Update:");
        String carnumber = commandLineScanner.nextLine();
        System.out.println("Enter the new CAR name that you want to add in the Database ");
        String carname = commandLineScanner.nextLine();

        if (myDatabse.getCarData().containsKey(carnumber))
        {
            car.setCarname(carname);
            car.setCarmodel(carnumber);
            myDatabse.updateCar(car);
        }

        Car carInMap = myDatabse.getCarData().get(carnumber);
        if(carInMap != null){
            carInMap.setCarname(carname);
            myDatabse.updateCar(carInMap);
        }

        System.out.println("Updated Database:");

        for (String key : carData.keySet()) { // using for loop checking the key
            Car c = carData.get(key);
            System.out.println(String.format("Car name: %s, Car Model number: %s,Car description: %s", c.getCarname(), c.getCarmodel(), c.getDescription()));// printing carname name and carnumber
        }
    }



    public static void main(String[] args) {

        //objectcreationForCarDeletion();
       // objectcreationForCarUpdate();

    }
}