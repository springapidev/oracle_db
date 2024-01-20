package com.coderbd;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Company {
    @Id
    private Long id;
    private String name;
}
