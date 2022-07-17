package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.List;

@Service
public class CarServiceImpl implements CarService{

    private List<Car> carList;

    public CarServiceImpl(List<Car> carList) {
        this.carList = carList;
        Car car1 = new Car("KIA", "Sportage", 2020);
        Car car2 = new Car("LADA", "Kalina", 2005);
        Car car3 = new Car("Subaru", "Forester", 2012);
        Car car4 = new Car("Hyundai", "Solaris", 2010);
        Car car5 = new Car("UAZ", "452", 1984);

        carList.add(car1);
        carList.add(car2);
        carList.add(car3);
        carList.add(car4);
        carList.add(car5);
    }

    public List<Car> showCars(int numberOfCars){
        if (numberOfCars == 0 || numberOfCars > 5){
            return carList;
        }

        if (numberOfCars <0){
            return null;
        }

        return carList.subList(0, numberOfCars);
    }

}
