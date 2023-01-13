package main.shop;

import main.category.Category;
import main.product.Product;
import main.seller.SellerSubscriber;
import main.stock.Stock;
import main.user.User;
import main.user.UserSubscriber;

import java.util.List;
import java.util.Map;

public class MyShop implements Shop, Publisher, ProductCreat{
    private List<Category> categories;
    private Map<UserSubscriber, ShopCart> users;
    private Stock stock;
    private List<SellerSubscriber> sellerList;

    @Override
    public void purchaseWholeCart() {

    }

    @Override
    public void addSubscriber(User user) {

    }

    @Override
    public void removeSubscriber(User user) {

    }

    @Override
    public void createProduct(Product product) {

    }

    @Override
    public void notifyUsers() {

    }

    @Override
    public void notifySellers() {

    }
}
