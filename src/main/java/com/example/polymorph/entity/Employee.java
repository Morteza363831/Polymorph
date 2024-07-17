package com.example.polymorph.entity;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.*;
import lombok.experimental.SuperBuilder;


@Entity
@Data
//@DiscriminatorValue("1")
public class Employee extends Person{
    private String company;

}
