package org.example.byuer;

import org.example.product.Product;
import org.example.stock.Stock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class Petrovich extends Byuer {

    @Autowired
    public Petrovich(Stock stock) {
        super(stock);
    }

    @Override
    public void getProductsFromStock() {
        List<Product> listVodkaStock = getStock().getListProduct().get("vodka");
        for (int i = 0; i < listVodkaStock.size(); i++) {
            if (listVodkaStock.get(i).isBroken()) {
                getListProduct().add(listVodkaStock.get(i));
                listVodkaStock.remove(i);
                getStock().setCountAllProduct(getStock().getCountAllProduct() - 1);
            }
        }
    }
}
