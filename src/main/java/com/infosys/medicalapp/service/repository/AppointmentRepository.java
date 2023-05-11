package com.infosys.medicalapp.service.repository;

import com.infosys.medicalapp.entity.Appointment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import java.util.Optional;

@Repository
public interface AppointmentRepository extends JpaRepository<Appointment, Integer> {

 /*   String createAppointment(Appointment appointment);

    String updateAppointment(Integer id);

    Optional<Appointment> findById(Integer id);

    @Override
    void deleteById(Integer id);

  */
}
