package my.projects.spring.util;

import java.util.Set;
import javax.annotation.PostConstruct;
import my.projects.spring.model.Role;
import my.projects.spring.model.User;
import my.projects.spring.service.RoleService;
import my.projects.spring.service.UserService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Component;

@Component
public class DataInitializer {
    private final Logger logger = LogManager.getLogger(DataInitializer.class);
    private final RoleService roleService;
    private final UserService userService;

    public DataInitializer(RoleService roleService, UserService userService) {
        this.roleService = roleService;
        this.userService = userService;
    }

    @PostConstruct
    public void inject() {
        roleService.add(new Role(Role.RoleName.ROLE_ADMIN));
        roleService.add(new Role(Role.RoleName.ROLE_USER));

        userService.add(new User("alice@gmail.com", "alice",
                Set.of(roleService.getRoleByName(Role.RoleName.ROLE_ADMIN))));
        userService.add(new User("bob@gmail.com", "bob",
                Set.of(roleService.getRoleByName(Role.RoleName.ROLE_USER))));
        userService.add(new User("carl@gmail.com", "carl",
                Set.of(roleService.getRoleByName(Role.RoleName.ROLE_USER),
                        roleService.getRoleByName(Role.RoleName.ROLE_ADMIN))));
        logger.info("Data has been injected!");
    }
}
