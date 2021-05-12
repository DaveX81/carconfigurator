package net.pentzlin.CarConfigurator.service;

import net.pentzlin.CarConfigurator.dao.*;
import net.pentzlin.CarConfigurator.entity.car.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarConfiguratorServiceImpl implements CarConfiguratorService {

    private CarRepository carRepository;
    private EngineRepository engineRepository;
    private ExtraEquipmentRepository extraEquipmentRepository;
    private PaintingRepository paintingRepository;
    private RimsRepository rimsRepository;

    @Autowired
    public CarConfiguratorServiceImpl(CarRepository carRepository,
                                      EngineRepository engineRepository,
                                      ExtraEquipmentRepository extraEquipmentRepository,
                                      PaintingRepository paintingRepository,
                                      RimsRepository rimsRepository) {
        this.carRepository = carRepository;
        this.engineRepository = engineRepository;
        this.extraEquipmentRepository = extraEquipmentRepository;
        this.paintingRepository = paintingRepository;
        this.rimsRepository = rimsRepository;

    }

    @Override
    public List<Car> getAllCars() {
        return carRepository.findAll();
    }

    @Override
    public List<Engine> getAllEngines() {
        return engineRepository.findAll();
    }

    @Override
    public List<ExtraEquipment> getAllExtraEquipment() {
        return extraEquipmentRepository.findAll();
    }

    @Override
    public List<Painting> getAllPainting() {
        return paintingRepository.findAll();
    }

    @Override
    public List<Rims> getAllRims() {
        return rimsRepository.findAll();
    }

}
