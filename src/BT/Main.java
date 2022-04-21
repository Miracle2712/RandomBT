package BT;

public class Main {
    public static void main(String[] args) {
        ProductManager pM = new ProductManager();
        Product p1 = new Product(1, "LG", 23000);
        Product p2 = new Product(2, "Samsung", 29000);
        Product p3 = new Product(3, "iPhone", 22050);
        pM.add(p1);
        pM.add(p2);
        pM.add(p3);
        pM.delete("LG");
        pM.update("Samsung", new Product(2, "LG", 28000));
        pM.search("LG");
        pM.sort();
        pM.display();
    }
}