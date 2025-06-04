package projects.ecommerce.service.impl;

import projects.ecommerce.models.User;
import projects.ecommerce.persistence.UserRepository;
import projects.ecommerce.service.UserService;

import java.util.List;

public class UserServiceImpl implements UserService {

    UserRepository userRepository = new UserRepository();

    @Override
    public void save(User user) {
        userRepository.save(user);
    }

    @Override
    public User getById(int id) {
        return userRepository.getById(id);
    }

    @Override
    public List<User> allUser() {
        return userRepository.getAll();
    }
}
