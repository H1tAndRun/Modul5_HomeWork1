package org.example.employee;

import org.example.product.Product;

public class Employee {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void destroyProduct(Product product) {
        product.setBroken(true);
    }
}
