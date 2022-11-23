package org.example.importer;

import org.example.stock.Stock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Absolut {

    @Autowired
    private Stock stock;

    public void addVodka(int countProduct) {
        stock.addVodka(countProduct);
    }
}
