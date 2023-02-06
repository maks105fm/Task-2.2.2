package web.dao;

import org.springframework.stereotype.Repository;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CarDaoImpl {

    private static final ArrayList<Car> cars = new ArrayList<>();

    static {
        cars.add(new Car(10L, "BMW1", 1));
        cars.add(new Car(20L, "BMW2", 2));
        cars.add(new Car(30L, "BMW3", 3));
        cars.add(new Car(40L, "BMW4", 4));
        cars.add(new Car(50L, "BMW4", 5));
    }

    public static List<Car> getAllCars() {
        List<Car> carList = cars;
        return carList;
    }

}
