package com.coforge.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import java.time.LocalDate;

@Data  // @Getter, @Setter, @ToString, @EqualsAndHashCode,@AllArgConstructor
@Entity
public class Customer {

    @Id
    @GeneratedValue
    private int id;
    private String name;
    private LocalDate dob;

    @OneToOne
    private Address address;

}
