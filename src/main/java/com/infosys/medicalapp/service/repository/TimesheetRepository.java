package com.infosys.medicalapp.service.repository;

import com.infosys.medicalapp.entity.TimeSheet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;


@Repository
public interface TimesheetRepository extends JpaRepository<TimeSheet, Integer> {

 /*   String createAppointment(TimeSheet timeSheet);

    String updateAppointment(Integer id);

    Optional<TimeSheet> findById(Integer id);

    @Override
    void deleteById(Integer id);

  */
}
