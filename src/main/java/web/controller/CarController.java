package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.service.CarService;

import java.util.List;

@Controller
public class CarController {

    private final CarService carService;

    public CarController(CarService carService) {
        this.carService = carService;
    }

    @GetMapping(value = "/cars")
    public String carList(@RequestParam(value = "count",
            required = false, defaultValue = "0") int count, Model model) {
        model.addAttribute("listOfCars", carService.getListOfCars(count));
        return "cars";
    }
}
