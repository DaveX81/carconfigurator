package net.pentzlin.CarConfigurator.entity.car;

import javax.persistence.*;

@Entity
public class Painting {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    @Column(unique = true, nullable = false)
    private String color;
    @Column(nullable = false)
    private int price;

    public int getId() {
        return id;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
