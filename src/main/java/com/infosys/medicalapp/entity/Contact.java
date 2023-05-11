package com.infosys.medicalapp.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name = "contact")
public class Contact {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "contact_id", nullable = false)
    private int contactId;

    @Column(name = "type", nullable = false)
    private String type;

    @Column(name = "contact_value", nullable = false, unique = true)
    private String contactValue;

}
