package projects.ecommerce.service;

import projects.ecommerce.models.User;

import java.util.List;

public interface UserService {
    void save(User user);
    User getById(int id);
    List<User> allUser();
}
