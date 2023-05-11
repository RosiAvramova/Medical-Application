package com.infosys.medicalapp.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;



@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name = "personContact")
public class PersonContact {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "person_contact_id", nullable = false)
    private int personContactId;

    @OneToOne
    @JoinColumn(name = "contact_id", nullable = false)
    private Contact contact;

}
