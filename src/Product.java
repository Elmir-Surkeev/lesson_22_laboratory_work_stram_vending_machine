import java.util.Objects;
import java.util.Random;

public class Product {
    private String name;
    private double price;
    private int count;
    Random rnd = new Random();
    //int RANDOM_COUNT = rnd.nextInt(10);

    public Product(String name, double price) {
        //Использовать так, из-за того что каждый раз одинаковое количество было
        int RANDOM_COUNT = rnd.nextInt(10);
        this.name = name;
        this.price = price;
        this.count = RANDOM_COUNT;
    }

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

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
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
