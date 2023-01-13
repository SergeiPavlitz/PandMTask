package main.shop;

import main.user.User;

public interface Shop {
    void purchaseWholeCart();

    void addSubscriber(User user);

    void removeSubscriber(User user);



}
