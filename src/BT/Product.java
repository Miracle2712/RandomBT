package BT;

import java.util.Comparator;

public class Product implements Comparable<Product> {
    private int id;
    private String name;
    private int price;

    public Product(int id, String name, int gia) {
        this.id = id;
        this.name = name;
        this.price = gia ;
    }

    public Product() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

    @Override
    public int compareTo(Product o) {
        return this.getPrice() - o.getPrice();
    }
}