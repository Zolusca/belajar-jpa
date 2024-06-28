package com.haslam.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Embeddable
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserAddress {
    private String country;
    private String city;
    private String address;
    @Column(name = "postal_code",length = 5)
    private Long postalCode;
}
