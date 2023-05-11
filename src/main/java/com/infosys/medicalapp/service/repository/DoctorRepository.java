package com.infosys.medicalapp.service.repository;

import com.infosys.medicalapp.entity.Doctor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface DoctorRepository extends JpaRepository<Doctor, Integer> {

    /*String createDoctor(Doctor doctor);

    String updateDoctor(Integer id);

    Optional<Doctor> findById(Integer id);

    @Override
    void deleteById(Integer id);
     */
}
