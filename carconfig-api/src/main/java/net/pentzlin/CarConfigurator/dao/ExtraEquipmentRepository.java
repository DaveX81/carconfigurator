package net.pentzlin.CarConfigurator.dao;

import net.pentzlin.CarConfigurator.entity.car.ExtraEquipment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ExtraEquipmentRepository extends JpaRepository <ExtraEquipment, Integer> {
}
