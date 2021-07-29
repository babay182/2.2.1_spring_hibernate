package hiber.service;

import hiber.model.User;
import org.hibernate.query.Query;

import java.util.List;

public interface UserService {
    public User userByCar(String model, int series);
    void add(User user);
    List<User> listUsers();
}
