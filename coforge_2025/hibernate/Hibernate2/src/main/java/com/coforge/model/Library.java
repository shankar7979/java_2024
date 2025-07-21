package com.coforge.model;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.Id;

@Getter
@Setter
@ToString
@Entity
@EqualsAndHashCode
public class Library {
    @Id
    private int libraryId;
    private  String libraryName;
    private  String  libraryLocation;
}
