package com.helloshop.order;

import com.helloshop.user.User;
import com.helloshop.product.Product;

public class Order {

    User user = new User();
    Product product = new Product();

    public Order(User user, Product product) {
        this.user = user;
        this.product = product;
    }
}
