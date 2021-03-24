package product;

import enums.Products;

public class Bed extends Product {
    private Products obj = Products.HOME;
    @Override
    public Products getProduct() {
        return obj;
    }
    @Override
    public void print() {
        System.out.println("Bed");
    }
}
