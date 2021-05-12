package net.pentzlin.CarConfigurator.dao;

import net.pentzlin.CarConfigurator.entity.order.CarOrder;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarOrderRepository extends JpaRepository <CarOrder, Integer> {
}
