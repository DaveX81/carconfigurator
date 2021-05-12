package net.pentzlin.CarConfigurator.service;

import net.pentzlin.CarConfigurator.entity.order.CarOrder;
import net.pentzlin.CarConfigurator.entity.order.Configuration;

import java.util.List;

public interface OrderService {
    List<CarOrder> getAllOrders();
    List<Configuration> getAllConfigurations();
    CarOrder orderConfiguration(String customer, Configuration configuration);
}
