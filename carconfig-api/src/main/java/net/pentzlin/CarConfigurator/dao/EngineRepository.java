package net.pentzlin.CarConfigurator.dao;

import net.pentzlin.CarConfigurator.entity.car.Engine;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EngineRepository extends JpaRepository <Engine, Integer> {
}
