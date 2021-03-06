package com.astontech.rest.domain;

import lombok.Data;

import javax.persistence.*;
import static javax.persistence.GenerationType.IDENTITY;


@Entity
@Data
public class Product {

    @Id
    @GeneratedValue(strategy = IDENTITY)
    private Integer id;

    @Column(nullable = false)
    private String sku;

    private String description;
    private Integer quantity;
    private Double price;
    private Double weight;
    private String dimensions;


}
