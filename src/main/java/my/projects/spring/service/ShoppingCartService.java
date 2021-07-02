package my.projects.spring.service;

import my.projects.spring.model.MovieSession;
import my.projects.spring.model.ShoppingCart;
import my.projects.spring.model.User;

public interface ShoppingCartService {
    void addSession(MovieSession movieSession, User user);

    ShoppingCart getByUser(User user);

    void registerNewShoppingCart(User user);

    void clear(ShoppingCart shoppingCart);
}
