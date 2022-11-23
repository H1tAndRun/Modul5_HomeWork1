package org.example.importer;

import org.example.employee.Employee;
import org.example.product.Bike;
import org.example.stock.Stock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Aist {

    @Autowired
    private Stock stock;

    public void addBike(int countProduct) {
        for (int i = 1; i <= countProduct; i++) {
            if (stock.getCountAllProduct() % 2 == 0) {
                Employee employee = stock.getEmployee2();
                Bike bike = new Bike();
                employee.destroyProduct(bike);
                stock.getListProduct().get("bike").add(bike);
            } else {
                stock.getListProduct().get("bike").add(new Bike());
            }
            stock.setCountAllProduct(stock.getCountAllProduct() + 1);
        }
    }
}
