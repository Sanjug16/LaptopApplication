package com.ust.Laptop_Application.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "Laptopdata")
public class Laptopmodel {
    @Id
    private int id;

    private String Brand;

    private long price;

    private String model;

    private double rating;
}
