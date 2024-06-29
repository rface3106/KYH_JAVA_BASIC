package hr0627.com.helloshop.order;

import hr0627.com.helloshop.product.Product;
import hr0627.com.helloshop.user.User;

public class OrderService {

    public void order(){
        User user = new User();
        Product product = new Product();
        Order order = new Order(user, product);


    }
}
