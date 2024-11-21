import java.util.Objects;
import java.util.Random;

public class Product {
    private String name;
    private double price;
    private int count;

    public Product() {
        this.name = String.valueOf(Name.random());
        if(name.equals("COLA")){
            this.price = 90;
        }else if(name.equals("PEPSI")){
            this.price = 75;
        }else {
            this.price = 40;
        }
    }
    private static Random rnd = new Random();


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Double.compare(price, product.price) == 0 && Objects.equals(name, product.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, price);
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", count=" + count +
                '}';
    }
}
