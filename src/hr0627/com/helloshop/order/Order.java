package hr0627.com.helloshop.order;

import hr0627.com.helloshop.product.Product;
import hr0627.com.helloshop.user.User;

public class Order {
    User user;
    Product product;

    public Order(User user, Product product){
        this.user = user;
        this.product = product;

    }
}
