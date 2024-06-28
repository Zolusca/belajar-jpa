package com.haslam;

import com.haslam.Entity.UserAddress;
import com.haslam.Entity.Users;
import com.haslam.Repository.UserRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class embeddedTest {
    @Autowired
    private UserRepository userRepository;
    @Test
    void createEmbedded(){
        UserAddress userAddress = new UserAddress();
        userAddress.setAddress("jl. kemerdekaan");
        userAddress.setCity("Jakarta");
        userAddress.setCountry("Indonesia");
        userAddress.setPostalCode(1521L);

        Users users = new Users();
        users.setUsername("admin");
        users.setUserAddress(userAddress);

        Assertions.assertDoesNotThrow(()->{
            userRepository.save(users);
        });
    }

    @Test
    void getEmbedded(){
        List<Users> usersList = userRepository.findAll();

        Assertions.assertNotNull(usersList);

        usersList.forEach(System.out::println);
    }
}
