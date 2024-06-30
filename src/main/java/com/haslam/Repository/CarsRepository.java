package com.haslam.Repository;

import com.haslam.Entity.Cars;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CarsRepository extends JpaRepository<Cars,String> {

    Optional<Cars> findByName(String s);
}
