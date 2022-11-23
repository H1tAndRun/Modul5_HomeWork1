package org.example.importer;

import org.example.employee.Employee;
import org.example.product.Vodka;
import org.example.stock.Stock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Absolut {

    @Autowired
    private Stock stock;

    public void addVodka(int countProduct) {
        for (int i = 1; i <= countProduct; i++) {
            if (stock.getCountAllProduct() % 2 == 0) {
                Employee employee = stock.getEmployee();
                Vodka vodka = new Vodka();
                employee.destroyProduct(vodka);
                stock.getListProduct().get("vodka").add(vodka);
            } else {
                stock.getListProduct().get("vodka").add(new Vodka());
            }
            stock.setCountAllProduct(stock.getCountAllProduct() + 1);
        }
    }
}
