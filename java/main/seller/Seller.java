package main.seller;

import main.product.Product;
import main.shop.ProductCreat;

public class Seller implements SellerSubscriber {
    private ProductCreat shop;

    public void createProduct(){
        shop.createProduct(new Product());
    }

    @Override
    public void update() {

    }
}
