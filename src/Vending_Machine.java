import java.util.ArrayList;
import java.util.List;

public class Vending_Machine {
    private List<Product> products;
    private double balance;

    public Vending_Machine() {
        this.products = new ArrayList<>();
        this.balance = 0;
    }
    public void addProduct(Product product) {
        this.products.add(product);
    }
    public void showAllProducts() {
        System.out.println("Доступные товары");
        products.forEach(System.out::println);
    }
    public void addCash(double cash) {
        this.balance += cash;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}