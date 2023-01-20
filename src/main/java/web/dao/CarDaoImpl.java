package web.dao;

import org.springframework.stereotype.Component;
import web.models.Car;

import java.util.ArrayList;
import java.util.List;

@Component
public class CarDaoImpl implements CarDao{
    private static int count;
    private List<Car> cars;
    {
        cars = new ArrayList<>();
        cars.add(new Car(++count, "Tesla", 2001));
        cars.add(new Car(++count, "BMW", 2002));
        cars.add(new Car(++count, "Audi", 2003));
        cars.add(new Car(++count, "Toyota", 2004));
        cars.add(new Car(++count, "Nissan", 2005));
    }

    public List<Car> getCars(int count) {

        Car el = null;
        List<Car> carsRes = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            el = cars.get(i);
            carsRes.add(el);
        }
        return carsRes;
    }

}
