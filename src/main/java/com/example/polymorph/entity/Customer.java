package com.example.polymorph.entity;

import jakarta.persistence.DiscriminatorColumn;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@DiscriminatorValue("2")
public class Customer extends Person{
    private String email;
}
