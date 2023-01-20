package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.dao.CarDaoImpl;

@Controller
public class CarController {
private final CarDaoImpl carDaoImpl;

    public CarController(CarDaoImpl carDaoImpl) {
        this.carDaoImpl = carDaoImpl;
    }

    @GetMapping("/cars")
    public String printCar(@RequestParam(value = "count", defaultValue = "5") int count, Model model) {
    model.addAttribute("cars", carDaoImpl.getCars(count));
    return "cars";
    }

}
