package com.example.polymorph.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
public class Customer extends Person{
    private String email;
}
