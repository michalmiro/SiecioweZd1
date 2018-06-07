package entities;

public class Product {
    public String name;
    public String price;

    public Product(String name, String price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return "name: "+name+" price: "+price;
    }
}
