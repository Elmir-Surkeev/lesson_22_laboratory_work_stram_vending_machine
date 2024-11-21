import java.util.*;

public class Products {
    private HashMap<Product, Integer> products = new HashMap<Product, Integer>();
    private final static int COUNT_PRODUCTS = 12;

    public Products() {
        addProduct();
    }

    public void addProduct() {
        for (int i = 0; i < COUNT_PRODUCTS; i++){
            //products.put(new Product(), 1);
            products.put(new Product(), products.getOrDefault(new Product(), 0) + 1);
        }
    }

    @Override
    public String toString() {
        return "" + products;
    }
}
