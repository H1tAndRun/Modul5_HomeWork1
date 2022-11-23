package org.example.stock;

import org.example.employee.Employee;
import org.example.product.Product;
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

