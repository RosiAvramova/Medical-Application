package com.infosys.medicalapp.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name = "person")
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "person_id", nullable = false)
    private int personId;

    @Column(name = "first_name", nullable = false)
    private String firstName;

    @Column(name = "last_name", nullable = false)
    private String lastName;

    @Column(name = "p_id", nullable = false, unique = true)
    private int pId;

    @Column(name = "sex", nullable = false)
    private String sex;

    @OneToOne
    @JoinColumn(name = "person_contact_id", nullable = false)
    private PersonContact personContact;

}
