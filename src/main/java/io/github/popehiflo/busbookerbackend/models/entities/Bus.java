package io.github.popehiflo.busbookerbackend.models.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
/*
* si estás utilizando Lombok en tus entidades, no necesitas anotarlas explícitamente con @Entity
* ya que Lombok generará el código necesario para que sean consideradas entidades JPA válidas.
* */
@Entity
@Table(name = "bus")
public class Bus {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long busId;
    private String busName;
    private String busType;
    private Integer totalSeat;
    @Column(unique = true)
    private String busNumber;

}
