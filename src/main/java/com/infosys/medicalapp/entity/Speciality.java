package com.infosys.medicalapp.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name = "speciality")
public class Speciality {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "speciality_id", nullable = false)
    private int specialityId;

    @Column(name = "speciality_name", nullable = false, unique = true)
    private String name;

    @Column(name = "description", nullable = false)
    private String description;


}
