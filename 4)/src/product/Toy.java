package product;

import enums.Products;

public class Toy extends Product {
    private Products obj = Products.CHILDREN;
    @Override
    public Products getProduct() {
        return obj;
    }
    @Override
    public void print() {
        System.out.println("Toy");
    }
}
