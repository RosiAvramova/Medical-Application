package com.infosys.medicalapp.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalTime;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name = "locations")
public class Location {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "location_id", nullable = false)
    private int locationId;

    @Column(name = "address", nullable = false)
    private String address;

    @Column(name = "details", nullable = false)
    private String details;

    @Column(name = "opens", nullable = false)
    private LocalTime open;

    @Column(name = "closes", nullable = false)
    private LocalTime close;

    @Column(name = "price", nullable = false)
    private double price;

    @OneToOne
    @JoinColumn(name = "location_contact_id", nullable = false)
    private LocationContact locationContact;
}
