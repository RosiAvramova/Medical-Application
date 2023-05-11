package com.infosys.medicalapp.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name = "patient")
public class Patient {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "patient_id", nullable = false)
    private int patientId;

    @Column(name = "blood_type", nullable = false)
    private String bloodType;

    @Column(name = "has_allergy", nullable = false)
    private boolean hasAllergy;

    @Column(name = "has_chronicle_disease", nullable = false)
    private boolean hasChronicleDisease;

    @OneToOne
    @JoinColumn(name = "person_id", nullable = false)
    private Person person;

}
