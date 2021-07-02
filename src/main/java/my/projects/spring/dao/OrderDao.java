package my.projects.spring.dao;

import java.util.List;
import my.projects.spring.model.Order;
import my.projects.spring.model.User;

public interface OrderDao {
    Order add(Order order);

    List<Order> getOrdersHistory(User user);
}
