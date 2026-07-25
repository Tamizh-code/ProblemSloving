package VehicleSystem.Service;

import VehicleSystem.dao.VehicleDAO;
import VehicleSystem.Model.*;

public class VehicleService {

    VehicleDAO dao = new VehicleDAO();

    public void addCar(int id,String brand,double price,int seats) {

        Vehicle v = new Car(id,brand,price,seats); // Polymorphism
        dao.save(v);
    }

    public void addBike(int id,String brand,double price,String type) {

        Vehicle v = new Bike(id,brand,price,type);
        dao.save(v);
    }

    public void view() {
        dao.showAll();
    }
}
