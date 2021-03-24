import enums.Products;
import product.Product;

public class Shop implements ProductRelease {
    public void printHome(Product[] arr) {
        for(int i = 0; i < arr.length; i++) {
            if(arr[i].getProduct() == Products.HOME) {
                arr[i].print();
            }
        }
    }
}
