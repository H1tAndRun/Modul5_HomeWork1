package org.example.byuer;

import org.example.product.Product;
import org.example.stock.Stock;

import java.util.ArrayList;
import java.util.List;

public abstract class Byuer {

    private final Stock stock;

    private final List<Product> listProduct = new ArrayList<>();

    public Byuer(Stock stock) {
        this.stock = stock;
    }

    public abstract void getProductsFromStock();

    public Stock getStock() {
        return stock;
    }

    public List<Product> getListProduct() {
        return listProduct;
    }
}
