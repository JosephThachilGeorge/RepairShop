package database;

import model.Car;
import model.Customer;
import model.Moterbike;
import model.Van;

import java.util.HashMap;
import java.util.Map;

public class DatabaseClass {

    private Map<String, Customer> customerMap = new HashMap<>();
    private Map<String, Car> carMap = new HashMap<>();
    private Map<String, Van> vanMap = new HashMap<>();
    private Map<String, Moterbike> motorbikeMap = new HashMap<>();

//***************************************************************For Customer database
    public void addCustomer(Customer customer) {
        if (customerMap.containsKey(customer.getCusnumber())) {
            System.out.println("Customer already present");
            return;
        }
        customerMap.put(customer.getCusnumber(), customer);
    }

    public void updateCustomer(Customer customer) {
        if (customerMap.containsKey(customer.getCusnumber())) {
            customerMap.put(customer.getCusnumber(), customer);
        } else {
            System.out.println("Customer not is present");
        }
    }

    public void deleteCustomer(Customer customer) {
        if (customerMap.containsKey(customer.getCusnumber())) {
            customerMap.remove(customer.getCusnumber(), customer);

        } else

          return;
    }

    public Map<String, Customer> getCustomerData() {
        return customerMap;
    }

    //************************************************************************For Car database

    public void addCar(Car car) {
        if (carMap.containsKey(car.getCarmodel())) {
            System.out.println("Car is already present");
            return;
        }
        carMap.put(car.getCarmodel(), car);
    }

    public void updateCar(Car car) {
        if (customerMap.containsKey(car.getCarmodel())) {
            carMap.put(car.getCarmodel(), car);
        } else {
            System.out.println("car not is present");
        }

    }

    public void deleteCar(Car car) {
        if (carMap.containsKey(car.getCarmodel())) {
             carMap.remove(car.getCarmodel(), car);
        } else
        return;
    }

    public Map<String, Car> getCarData() {
        return carMap;

    }

   //********************************************************************* For Moterbike Database

    public void addMoterbike(Moterbike moterbike) {
        if (motorbikeMap.containsKey(moterbike.getMoterbikeModel())) {
            System.out.println("Moterbike is already present");
            return;
        }
        motorbikeMap.put(moterbike.getMoterbikeModel(), moterbike);
    }

    public void updataMoterbike(Moterbike moterbike){

        if(motorbikeMap.containsKey(moterbike.getMoterbikeModel())){
            motorbikeMap.put(moterbike.getMoterbikeModel(),moterbike);
            } else

        {
            System.out.println("Moterbike not is present");
        }
    }

    public void deleteMoterbike(Moterbike moterbike){

        if(motorbikeMap.containsKey(moterbike.getMoterbikeModel())){

            motorbikeMap.remove(moterbike.getMoterbikeModel(),moterbike);
        }

        else
            return;
    }

    public Map<String, Moterbike> getMoterbikepData() {
        return motorbikeMap;

    }

    //********************************************************************* For Van Database

    public void addVan(Van van){
        if(vanMap.containsKey(van.getVanmodel())){
            System.out.println("Van is already present");
            return;
        }
        vanMap.put(van.getVanmodel(), van);

    }

    public void updateVan(Van van) {
        if (vanMap.containsKey(van.getVanmodel())) {
            vanMap.put(van.getVanmodel(), van);
        } else {
            System.out.println("Van is not present");
        }

        }


    public void deleteVan(Van van) {
        if (vanMap.containsKey(van.getVanmodel())) {
            vanMap.remove(van.getVanmodel(), van);

        } else

            return;
    }

    public Map<String, Van> getVanData() {
        return vanMap;


 }
}