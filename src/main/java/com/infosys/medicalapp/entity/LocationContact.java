package com.infosys.medicalapp.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name = "locationContact")
public class LocationContact {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "location_contact_id", nullable = false)
    private int locationContactId;

    @OneToOne
    @JoinColumn(name = "contact_id", nullable = false)
    private Contact contact;

}
