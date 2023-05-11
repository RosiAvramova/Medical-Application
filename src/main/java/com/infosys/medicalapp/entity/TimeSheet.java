package com.infosys.medicalapp.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalTime;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name = "timesheet")
public class TimeSheet {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "timesheet_id", nullable = false)
    private int timesheetId;

    @Column(name = "day_of_week", nullable = false)
    private String dayOfWeek;

    @Column(name = "start_working", nullable = false)
    private LocalTime startWorking;

    @Column(name = "end_working", nullable = false)
    private LocalTime endWorking;

    @Column(name = "exception_date", nullable = false)
    private LocalDate exceptionDate;

    @OneToOne
    @JoinColumn(name = "location_id", nullable = false)
    private Location location;

}
