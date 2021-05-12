package net.pentzlin.CarConfigurator.service;

import net.pentzlin.CarConfigurator.entity.car.*;

import java.util.List;

public interface CarConfiguratorService {
    List<Car> getAllCars();
    List<Engine> getAllEngines();
    List<ExtraEquipment> getAllExtraEquipment();
    List<Painting> getAllPainting();
    List<Rims> getAllRims();
}
