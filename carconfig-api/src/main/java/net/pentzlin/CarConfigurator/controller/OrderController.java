package net.pentzlin.CarConfigurator.controller;

import net.pentzlin.CarConfigurator.entity.order.CarOrder;
import net.pentzlin.CarConfigurator.entity.order.Configuration;
import net.pentzlin.CarConfigurator.service.CarConfiguratorService;
import net.pentzlin.CarConfigurator.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class OrderController {

    private final OrderService orderService;

    @Autowired
    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }

    @GetMapping("/order")
    public List<CarOrder> getAllOrders() {
        return orderService.getAllOrders();
    }

    @GetMapping("/order/configuration")
    public List<Configuration> getAllOrderedConfigurations() {
        return orderService.getAllConfigurations();
    }

    @PostMapping("/order/configuration")
    @ResponseStatus(HttpStatus.CREATED)
    public CarOrder orderConfiguration(@RequestBody Configuration configuration) {
        return orderService.orderConfiguration("WEB", configuration);
    }
}
