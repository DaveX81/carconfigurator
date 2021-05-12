package net.pentzlin.CarConfigurator.entity.order;

import net.pentzlin.CarConfigurator.entity.car.Car;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
public class CarOrder {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    private String customer;
    @Column(nullable = false)
    private LocalDateTime orderDate;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(nullable = false)
    private Configuration configuration;

    public CarOrder() {}

    public CarOrder(String customer) {
        this.customer = customer;
        this.orderDate = LocalDateTime.now();
    }

    public CarOrder(String customer, Configuration configuration) {
        this(customer);
        this.configuration = configuration;
    }

    public int getId() {
        return id;
    }

    public String getCustomer() {
        return customer;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }

    public LocalDateTime getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(LocalDate LocalDateTime) {
        this.orderDate = orderDate;
    }

    public Configuration getConfiguration() {
        return configuration;
    }

    public void setConfiguration(Configuration configuration) {
        this.configuration = configuration;
    }
}
