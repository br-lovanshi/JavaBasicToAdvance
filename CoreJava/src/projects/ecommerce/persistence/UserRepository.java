package projects.ecommerce.persistence;

import projects.ecommerce.exception.NotFoundException;
import projects.ecommerce.models.User;

import java.util.ArrayList;
import java.util.List;

public class UserRepository {
    private List<User> users = new ArrayList<>();

    public void save(User user){
        users.add(user);
    }

    public User getById(int id){
        return users.stream().filter(user -> user.getId() == id).findFirst().orElseThrow(() -> new NotFoundException("User not found."));
    }

    public List<User> getAll(){
        return users;
    }

}
