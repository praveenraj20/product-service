package com.microservice.product.Entity;

import lombok.Getter;

import javax.persistence.*;

@Entity
@Getter
@Table(name = "product")
public class Product{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, name = "product_id")
    private Long productID;

    private  String productName;

    private  Integer quantity;

    private  Double amount;

}

