package my.projects.spring.service;

import my.projects.spring.model.User;

public interface AuthenticationService {
    User register(String email, String password);
}
