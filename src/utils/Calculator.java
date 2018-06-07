package utils;

import entities.Product;
import servlets.productsServlet;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Calculator {


    public static double calculatePrice() {
        ArrayList<Product> products = productsServlet.products;
        double price = 0;
        for (Product p : products) {
            price += Double.parseDouble(p.price);
        }

        return price;
    }

    public static double calculateAveragePrice() {
        double price = calculatePrice();
        double avPrice = price / productsServlet.products.size();
        return avPrice;
    }

}
