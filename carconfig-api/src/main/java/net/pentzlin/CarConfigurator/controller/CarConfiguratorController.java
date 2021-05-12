package net.pentzlin.CarConfigurator.controller;

import net.pentzlin.CarConfigurator.entity.car.*;
import net.pentzlin.CarConfigurator.service.CarConfiguratorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class CarConfiguratorController {

    private final CarConfiguratorService carConfiguratorService;

    @Autowired
    public CarConfiguratorController(CarConfiguratorService carConfiguratorService) {
        this.carConfiguratorService = carConfiguratorService;
    }

    @GetMapping("/configuration/car")
    public List<Car> getAllCars() {
        return carConfiguratorService.getAllCars();
    }

    @GetMapping("/configuration/engine")
    public List<Engine> getAllEngines() {
        return carConfiguratorService.getAllEngines();
    }

    @GetMapping("/configuration/extraEquipment")
    public List<ExtraEquipment> getAllExtraEquipment() {
        return carConfiguratorService.getAllExtraEquipment();
    }

    @GetMapping("/configuration/painting")
    public List<Painting> getAllPainting() {
        return carConfiguratorService.getAllPainting();
    }

    @GetMapping("/configuration/rims")
    public List<Rims> getAllRims() {
        return carConfiguratorService.getAllRims();
    }

}
