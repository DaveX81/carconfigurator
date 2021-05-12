package net.pentzlin.CarConfigurator.entity.car;

import javax.persistence.*;

@Entity
public class Engine {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    @Column(nullable = false, unique = true)
    private int power;
    @Column(nullable = false)
    private int price;

    public int getId() {
        return id;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
