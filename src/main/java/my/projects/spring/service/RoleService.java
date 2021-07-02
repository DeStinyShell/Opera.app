package my.projects.spring.service;

import my.projects.spring.model.Role;

public interface RoleService {
    void add(Role role);

    Role getRoleByName(Role.RoleName roleName);
}
