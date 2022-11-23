package org.example.stock;

import org.example.employee.Employee;
import org.example.product.Bike;
import org.example.product.Product;
import org.example.product.Vodka;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Component
public class Stock {

    private final Map<String, List<Product>> listProduct =
            Map.of("vodka", new ArrayList<>(), "bike", new ArrayList<>());

    private final Employee employee;

    private final Employee employee2;

    private int countAllProduct;

    @Autowired
    public Stock(@Qualifier("misha") Employee employee, @Qualifier("zelia") Employee employee2) {
        this.employee = employee;
        this.employee2 = employee2;
    }

    public void addVodka(int countProduct) {
        for (int i = 1; i <= countProduct; i++) {
            if (countAllProduct % 2 == 0) {
                Vodka vodka = new Vodka();
                employee.destroyProduct(vodka);
                listProduct.get("vodka").add(vodka);
            } else {
                listProduct.get("vodka").add(new Vodka());
            }
            countAllProduct++;
        }
    }

    public void addBike(int countProduct) {
        for (int i = 1; i <= countProduct; i++) {
            if (countAllProduct % 2 == 0) {
                Bike bike = new Bike();
                employee.destroyProduct(bike);
                listProduct.get("bike").add(bike);
            } else {
                listProduct.get("bike").add(new Bike());
            }
            countAllProduct++;
        }
    }

    public int getCountAllProduct() {
        return countAllProduct;
    }

    public void setCountAllProduct(int countAllProduct) {
        this.countAllProduct = countAllProduct;
    }

    public Map<String, List<Product>> getListProduct() {
        return listProduct;
    }

    public Employee getEmployee() {
        return employee;
    }

    public Employee getEmployee2() {
        return employee2;
    }
}

