package alla.verkhohliadova.demo_dealer.entity;

import lombok.*;

import javax.persistence.*;
import java.util.List;

@NoArgsConstructor
@Getter
@Setter
@AllArgsConstructor
@ToString
@EqualsAndHashCode

@Entity
public class Car {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private Long price;
    private Double volume;
    private boolean abs;

    @ManyToOne
    private Country country;

    @OneToOne
    private Engine engine;

    @ManyToMany (mappedBy = "cars")
    private List<User> users;

    public Car(Long id, String name, Long price, Double volume, boolean abs) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.volume = volume;
        this.abs = abs;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getPrice() {
        return price;
    }

    public void setPrice(Long price) {
        this.price = price;
    }

    public Double getVolume() {
        return volume;
    }

    public void setVolume(Double volume) {
        this.volume = volume;
    }

    public boolean isAbs() {
        return abs;
    }

    public void setAbs(boolean abs) {
        this.abs = abs;
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", volume=" + volume +
                ", abs=" + abs +
                '}';
    }


}
