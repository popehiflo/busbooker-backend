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
@Entity
@Table(name = "bus_schedule")
public class BusSchedule {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long scheduleId;
    @OneToOne
    @JoinColumn(name = "bus_id")
    private Bus bus;
    @OneToOne
    @JoinColumn(name = "bus_route_id")
    private BusRoute busRoute;
    private String departureTime;
    private Integer ticketPrice;
    private Integer discount;
    private Integer processingFee;

}
