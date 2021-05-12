package net.pentzlin.CarConfigurator.service;

import net.pentzlin.CarConfigurator.dao.CarOrderRepository;
import net.pentzlin.CarConfigurator.dao.ConfigurationRepository;
import net.pentzlin.CarConfigurator.entity.order.CarOrder;
import net.pentzlin.CarConfigurator.entity.order.Configuration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderServiceImpl implements OrderService {

    private CarOrderRepository carOrderRepository;
    private  ConfigurationRepository configurationRepository;

    @Autowired
    public OrderServiceImpl(CarOrderRepository carOrderRepository, ConfigurationRepository configurationRepository) {
        this.carOrderRepository = carOrderRepository;
        this.configurationRepository = configurationRepository;
    }

    @Override
    public List<CarOrder> getAllOrders() {
        return carOrderRepository.findAll();
    }

    @Override
    public List<Configuration> getAllConfigurations() {
        return configurationRepository.findAll();
    }

    @Override
    public CarOrder orderConfiguration(String customer, Configuration configuration) {
        var carOrder = new CarOrder(customer, configuration);
        return carOrderRepository.save(carOrder);
    }
}
