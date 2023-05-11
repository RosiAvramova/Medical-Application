package com.infosys.medicalapp.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Time;


@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@Table(name = "doctor")
public class Doctor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "doctor_id", nullable = false)
    private int doctorId;

    @Column(name = "introduction", nullable = false)
    private String introduction;

    @OneToOne
    @JoinColumn(name = "person_id", nullable = false)
    private Person person;

    @OneToOne
    @JoinColumn(name = "timesheet_id", nullable = false)
    private TimeSheet timeSheet;

    @OneToOne
    @JoinColumn(name = "speciality_id", nullable = false)
    private Speciality speciality;


}
