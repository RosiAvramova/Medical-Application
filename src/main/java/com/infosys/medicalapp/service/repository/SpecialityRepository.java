package com.infosys.medicalapp.service.repository;

import com.infosys.medicalapp.entity.Speciality;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface SpecialityRepository extends JpaRepository<Speciality, Integer> {

  /*  String createSpeciality(Speciality speciality);

    String updateLocation(Integer id);

    Optional<Speciality> findById(Integer id);

    @Override
    void deleteById(Integer id);

   */
}
