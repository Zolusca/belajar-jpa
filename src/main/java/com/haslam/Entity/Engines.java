package com.haslam.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import static jakarta.persistence.FetchType.LAZY;

@Entity
@Table(name = "engine")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Engines {
    @Id
    private String id;
    private Integer power;
    private String name;
    @OneToOne(mappedBy = "engines")
    private Cars car;
}
