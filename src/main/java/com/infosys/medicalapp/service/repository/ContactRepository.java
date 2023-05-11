package com.infosys.medicalapp.service.repository;

import com.infosys.medicalapp.entity.Contact;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ContactRepository extends JpaRepository<Contact, Integer> {

  /*  String createContact(Contact contact);

    String updateContact(Integer id);

    Optional<Contact> findById(Integer id);

    @Override
    void deleteById(Integer id);

   */
}
