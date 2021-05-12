package net.pentzlin.CarConfigurator.entity.car;

import net.pentzlin.CarConfigurator.entity.order.Configuration;

import javax.persistence.*;

@Entity
public class ExtraEquipment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    @Column(nullable = false, unique = true)
    private String name;
    @Column(nullable = false)
    private int price;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
