package my.projects.spring.service;

import java.util.List;
import my.projects.spring.model.Order;
import my.projects.spring.model.ShoppingCart;
import my.projects.spring.model.User;

public interface OrderService {
    Order completeOrder(ShoppingCart shoppingCart);

    List<Order> getOrdersHistory(User user);
}
