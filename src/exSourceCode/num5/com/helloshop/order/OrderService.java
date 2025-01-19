package exSourceCode.num5.com.helloshop.order;

import exSourceCode.num5.com.helloshop.product.Product;
import com.helloshop.user.User;

public class OrderService {

    public void order() {
        User user = new User();
        Product product = new Product();
        Order order = new Order(user, product);
    }
}
