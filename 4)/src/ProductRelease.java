import enums.Products;
import product.Door;
import product.Product;

public interface ProductRelease  {
    default void printProduct(Product obj) {
        switch (obj.getProduct().name()) {
            case "HOME" : {
                System.out.println("Home");
                break;
            }
            case "CHILDREN" : {
                System.out.println("Children");
                break;
            }
            case "HOUSEHOLD" : {
                System.out.println("Household");
                break;
            }
            case "PHARMACY" : {
                System.out.println("Pharmacy");
            }
        }
    }

}
