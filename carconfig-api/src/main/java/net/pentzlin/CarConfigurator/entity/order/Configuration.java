package net.pentzlin.CarConfigurator.entity.order;

import com.fasterxml.jackson.annotation.JsonIgnore;
import net.pentzlin.CarConfigurator.entity.car.*;

import javax.persistence.*;
import java.util.List;

@Entity
public class Configuration {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    @Column(nullable = false)
    private int price;
    @ManyToOne
    @JoinColumn(nullable = false)
    private Car car;
    @ManyToOne
    @JoinColumn(nullable = false)
    private Rims rims;
    @ManyToOne
    @JoinColumn(nullable = false)
    private Engine engine;
    @ManyToOne
    @JoinColumn(nullable = false)
    private Painting painting;
    @OneToOne(mappedBy = "configuration")
    private CarOrder carOrder;
    @ManyToMany
    @JoinTable(name="Configuration_Extra")
    List<ExtraEquipment> extraEquipment;

    public int getId() {
        return id;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public Rims getRims() {
        return rims;
    }

    public void setRims(Rims rims) {
        this.rims = rims;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public Painting getPainting() {
        return painting;
    }

    public void setPainting(Painting painting) {
        this.painting = painting;
    }

    @JsonIgnore
    public CarOrder getCarOrder() {
        return carOrder;
    }

    public void setCarOrder(CarOrder carOrder) {
        this.carOrder = carOrder;
    }

    public List<ExtraEquipment> getExtraEquipment() {
        return extraEquipment;
    }

    public void setExtraEquipment(List<ExtraEquipment> extraEquipment) {
        this.extraEquipment = extraEquipment;
    }
}
