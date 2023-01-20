package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import web.dao.CarDao;
import web.models.Car;

import java.util.List;
@Service
public class CarServiseImpl implements CarService{
    private CarDao carDao;
    @Override
    public List<Car> getCars(int count) {
        return carDao.getCars(count);
    }
}
