package org.example.importer;

import org.example.stock.Stock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Aist {

    @Autowired
    private Stock stock;

    public void addBike(int countProduct) {
        stock.addBike(countProduct);
    }
}
