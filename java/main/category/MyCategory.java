package main.category;

import main.product.Product;

import java.util.List;

public class MyCategory implements Category, CategoryComponent {

    private String name;
    private List<Product> productList;

    // constructors and getters/setters

    @Override
    public String displayProducts() {
        return null;
    }

    @Override
    public String displayChildren() {
        return null;
    }
}
