package my.projects.spring.service;

import my.projects.spring.model.User;

public interface UserService {
    User add(User user);

    User get(Long id);

    User findByEmail(String email);
}
