package com.coderyu.Domain;

import java.math.BigDecimal;
public class Product {
    private Long id;
    private String name;
    private BigDecimal price;
    private String description;

    public Product(){}
    public Product(String name,BigDecimal price,String description){
        this.name=name;
        this.price=price;
        this.description=description;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
