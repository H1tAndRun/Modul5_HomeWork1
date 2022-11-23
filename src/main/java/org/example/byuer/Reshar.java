package org.example.byuer;

import org.example.product.Product;
import org.example.stock.Stock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class Reshar extends Byuer {

    @Autowired
    public Reshar(Stock stock) {
        super(stock);
    }

    @Override
    public void getProductsFromStock() {
        List<Product> listBikeStock = getStock().getListProduct().get("bike");
        for (int i = 0; i < listBikeStock.size(); i++) {
            if (listBikeStock.get(i).isBroken()) {
                getListProduct().add(listBikeStock.get(i));
                listBikeStock.remove(i);
                getStock().setCountAllProduct(getStock().getCountAllProduct() - 1);
            }
        }
    }
}
