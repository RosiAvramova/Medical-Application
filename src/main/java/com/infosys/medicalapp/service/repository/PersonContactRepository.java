package com.infosys.medicalapp.service.repository;

import com.infosys.medicalapp.entity.PersonContact;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface PersonContactRepository extends JpaRepository<PersonContact, Integer> {

  /*  String createPersonContact(PersonContact personContact);

    String updatePersonContact(Integer id);

    Optional<PersonContact> findById(Integer id);

    @Override
    void deleteById(Integer id);

   */
}
