package com.haslam.Repository;

import com.haslam.Entity.Engines;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EngineRepository extends JpaRepository<Engines,String> {
}
