package web.Services;

import web.dao.Car;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarService {
    private final List<Car> cars;


    public CarService() {
        cars = new ArrayList<>();
        cars.add(new Car(1, "BMW", "black"));
        cars.add(new Car(2, "Toyota", "white"));
        cars.add(new Car(3, "Mercedes", "blue"));
        cars.add(new Car(4, "AUDI", "red"));
        cars.add(new Car(5, "Shkoda", "brown"));
    }

    public List<Car> getAllCars(Integer count) {

        if (count == null || count >= 5) {
            return cars;
        }
        return cars.subList(0, count);
    }

}
