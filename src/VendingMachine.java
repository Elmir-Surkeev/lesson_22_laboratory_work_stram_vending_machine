import java.util.ArrayList;
import java.util.List;

public class VendingMachine {
    private List<Product> products;
    private double balance;

    public VendingMachine() {
        this.products = new ArrayList<>();
        this.balance = 0;
    }
    public void addProduct(Product product) {
        this.products.add(product);
    }
    public void showAllProducts() {
        System.out.println("Доступные товары:");
        for (Product product : products) {
            if (product.getCount() > 0) {
                System.out.println("- " + product.getName() + " | Цена: " + product.getPrice() + " | Количество: " + product.getCount());
            }
        }
    }
    public void addCash(double cash) {
        this.balance += cash;
    }
    public void filterProducts(){
        products.stream()
                .filter(product -> product.getPrice() <= balance  && product.getCount() > 0)
                .forEach(System.out::println);

    }
    public void buyProduct(String productName) {
        products.stream()
                .filter(product -> product.getName().equals(productName))
                .findFirst()
                .ifPresentOrElse(
                            product -> {
                        if (product.getPrice() <= balance && product.getCount() > 0) {
                            product.setCount(product.getCount() - 1);
                            balance -= product.getPrice();
                            System.out.println("Успешная покупка " + product.getName());
                            System.out.println("Ваш баланс " + balance + " сом");
                        }else {
                            System.out.println("Недостаточно средств");
                        }
                    },
                    ()-> System.out.println("Товар не найден")
                );
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