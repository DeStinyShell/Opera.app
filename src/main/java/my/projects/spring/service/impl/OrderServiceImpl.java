package my.projects.spring.service.impl;

import java.time.LocalDateTime;
import java.util.List;
import my.projects.spring.dao.OrderDao;
import my.projects.spring.model.Order;
import my.projects.spring.model.ShoppingCart;
import my.projects.spring.model.User;
import my.projects.spring.service.OrderService;
import my.projects.spring.service.ShoppingCartService;
import org.springframework.stereotype.Service;

@Service
public class OrderServiceImpl implements OrderService {
    private final OrderDao orderDao;
    private final ShoppingCartService shoppingCartService;

    public OrderServiceImpl(OrderDao orderDao, ShoppingCartService shoppingCartService) {
        this.orderDao = orderDao;
        this.shoppingCartService = shoppingCartService;
    }

    @Override
    public Order completeOrder(ShoppingCart shoppingCart) {
        Order order = new Order(
                shoppingCart.getTickets(), LocalDateTime.now(), shoppingCart.getUser());
        orderDao.add(order);
        shoppingCartService.clear(shoppingCart);
        return order;
    }

    @Override
    public List<Order> getOrdersHistory(User user) {
        return orderDao.getOrdersHistory(user);
    }
}
