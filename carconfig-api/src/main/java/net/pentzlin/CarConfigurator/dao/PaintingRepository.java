package net.pentzlin.CarConfigurator.dao;

import net.pentzlin.CarConfigurator.entity.car.Painting;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaintingRepository extends JpaRepository <Painting, Integer> {
}
