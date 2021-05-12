package net.pentzlin.CarConfigurator.dao;

import net.pentzlin.CarConfigurator.entity.order.Configuration;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ConfigurationRepository extends JpaRepository <Configuration, Integer> {
}
