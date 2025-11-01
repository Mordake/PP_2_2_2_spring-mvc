package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.Services.CarService;
import web.dao.Car;

import java.util.List;

@Controller
public class CarController {
    private final CarService carService;

    public CarController(CarService carService) {
        this.carService = carService;
    }

    @GetMapping("/cars")
    public String getCar(@RequestParam(value="count", required = false) Integer count, Model model) {
        List<Car> cars = carService.getAllCars(count);
        model.addAttribute("nameTable", "Cars");
        model.addAttribute("cars", cars);

        return "cars";
    }



}
