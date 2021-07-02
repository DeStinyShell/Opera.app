package my.projects.spring.dao;

import java.util.Optional;
import my.projects.spring.model.Role;

public interface RoleDao {
    void add(Role role);

    Optional<Role> getRoleByName(Role.RoleName roleName);
}
