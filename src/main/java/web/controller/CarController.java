package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.CarServiceImpl;


@Controller
public class CarController {

    private final CarServiceImpl carService;

    public CarController(CarServiceImpl carService) {
        this.carService = carService;
    }


    @GetMapping(value = "/cars")
    public String printCars(@RequestParam(value = "count", defaultValue = "0") int count, ModelMap model) {
        model.addAttribute("list", carService.showCars(count));
        return "cars";
    }
}
