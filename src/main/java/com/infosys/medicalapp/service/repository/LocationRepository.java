package com.infosys.medicalapp.service.repository;

import com.infosys.medicalapp.entity.Location;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface LocationRepository extends JpaRepository<Location, Integer> {

  /*  String createLocation(Location location);

    String updateLocation(Integer id);

    Optional<Location> findById(Integer id);

    Optional<Location> findByAddress(String address);

    @Override
    void deleteById(Integer id);

   */
}
