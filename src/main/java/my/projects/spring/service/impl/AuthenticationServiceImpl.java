package my.projects.spring.service.impl;

import java.util.Set;
import my.projects.spring.model.Role;
import my.projects.spring.model.User;
import my.projects.spring.service.AuthenticationService;
import my.projects.spring.service.RoleService;
import my.projects.spring.service.ShoppingCartService;
import my.projects.spring.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class AuthenticationServiceImpl implements AuthenticationService {
    private final RoleService roleService;
    private final ShoppingCartService shoppingCartService;
    private final UserService userService;

    public AuthenticationServiceImpl(RoleService roleService,
            UserService userService,
            ShoppingCartService shoppingCartService) {
        this.roleService = roleService;
        this.userService = userService;
        this.shoppingCartService = shoppingCartService;
    }

    @Override
    public User register(String email, String password) {
        User user = new User(email, password,
                Set.of(roleService.getRoleByName(Role.RoleName.ROLE_USER)));
        userService.add(user);
        shoppingCartService.registerNewShoppingCart(user);
        return user;
    }
}
