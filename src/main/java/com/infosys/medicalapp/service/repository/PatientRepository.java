package com.infosys.medicalapp.service.repository;

import com.infosys.medicalapp.entity.Patient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface PatientRepository extends JpaRepository<Patient, Integer> {

  /*  String createPatient(Patient patient);

    String updatePatient(Integer id);

    Optional<Patient> findById(Integer id);

    @Override
    void deleteById(Integer id);

   */

}
