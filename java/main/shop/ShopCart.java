package main.shop;

import main.product.Product;

import java.util.List;

public interface ShopCart {
    void addProduct(Product product);
    void removeProduct(Product product);
    List<String> productsInCart();
    Integer getTotalPrice();
}
