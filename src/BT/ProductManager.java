package BT;

import java.util.ArrayList;
import java.util.Collections;

public class ProductManager {
    private ArrayList<Product> products = new ArrayList<>();

    public ProductManager() {
    }

    public void add(Product p) {
        products.add(p);
    }

    public void delete(String name) {
        products.remove(searchID(name));
    }

    public void update(String name, Product p) {
        products.set(searchID(name), p);
    }

    public int searchID(String name) {
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).getName().equals(name)) {
                return i;
            }
        }
        return -1;
    }

    public void search(String name) {
        System.out.println(products.get(searchID(name)).toString());

    }

    public void display() {
        for (Product i : products) {
            System.out.println(i.toString());
        }
    }

    public void sort() {
        Collections.sort(products);
    }
}