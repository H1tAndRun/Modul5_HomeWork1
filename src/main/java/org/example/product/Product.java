package org.example.product;

public abstract class Product {

    private boolean isBroken;

    public boolean isBroken() {
        return isBroken;
    }

    public void setBroken(boolean broken) {
        isBroken = broken;
    }
}
