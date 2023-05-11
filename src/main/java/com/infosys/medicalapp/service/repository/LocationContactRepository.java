package com.infosys.medicalapp.service.repository;

import com.infosys.medicalapp.entity.LocationContact;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface LocationContactRepository extends JpaRepository<LocationContact, Integer> {

 /*   String createLocationContact(LocationContact locationContact);

    String updateLocationContact(Integer id);

    Optional<LocationContact> findById(Integer id);

    @Override
     void deleteById(Integer id);
     */
}
