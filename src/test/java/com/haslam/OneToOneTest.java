package com.haslam;

import com.haslam.Entity.Cars;
import com.haslam.Entity.Engines;
import com.haslam.Repository.CarsRepository;
import com.haslam.Repository.EngineRepository;
import org.aspectj.lang.annotation.Before;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Example;
import org.springframework.data.repository.query.FluentQuery;

import java.util.function.Function;
import java.util.function.Predicate;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
public class OneToOneTest {
    @Autowired private EngineRepository engineRepository;
    @Autowired private CarsRepository carsRepository;

    @Test
    void createCar(){
        Engines engines = new Engines();
        engines.setName("Lifter10");
        engines.setPower(108);

        Cars cars = new Cars();
        cars.setName("MBR-308");

        Cars x = carsRepository.save(cars);

        engines.setId(x.getId());
        engineRepository.save(engines);
    }

}
