package alla.verkhohliadova.demo_dealer.entity;

import lombok.*;

import javax.persistence.*;

@NoArgsConstructor
@Getter
@Setter
@AllArgsConstructor
@ToString
@EqualsAndHashCode

@Entity
public class Engine {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Double volume;
    private  Integer serialNumber;

    @OneToOne (mappedBy = "engine")
    private Car car;


}
