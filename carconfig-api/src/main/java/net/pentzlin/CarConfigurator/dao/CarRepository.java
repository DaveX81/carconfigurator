package net.pentzlin.CarConfigurator.dao;

import net.pentzlin.CarConfigurator.entity.car.Car;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarRepository extends JpaRepository <Car, Integer> {
}
