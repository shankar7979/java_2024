package com.coforge.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.time.LocalDate;

@Data  // @Getter, @Setter, @ToString, @EqualsAndHashCode,@AllArgConstructor
@Entity
public class Address {

    @Id
    @GeneratedValue
    private int addr_id;
    private String city;
    private String state;
}
