package com.infosys.medicalapp.service.repository;

import com.infosys.medicalapp.entity.Patient;
import com.infosys.medicalapp.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface PersonRepository extends JpaRepository<Person, Integer> {

  /*  String createPerson(Person person);

    String updatePerson(Integer id);

    Optional<Person> findById(Integer id);

    @Override
    void deleteById(Integer id);

   */
}
