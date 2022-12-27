package com.example.garage2.controller;

import com.example.garage2.model.Car;
import com.example.garage2.service.CarService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Cars")
public class CarController {

    private final CarService carService;

    public CarController(CarService carService) {
        this.carService = carService;
    }

    @PutMapping
    public Car addCar(@RequestBody Car car) {
        return carService.createCar(car);
    }

    @GetMapping("/{id}")
    public Car getCar(@PathVariable int id) {
        return carService.getCar(id);
    }

    @GetMapping
    public List<Car> getAllCars() {
        return carService.getAllCars();
    }


    @PostMapping("/{id}")
    public Car updateCar(@PathVariable int id, @RequestBody Car car) {
        return carService.updateCar(id, car);
    }


    @DeleteMapping("/{id}")
    public List<Car> deleteCar(@PathVariable int id) {
        return carService.removeCar(id);
    }
}
