package hiber.service;

import hiber.model.User;
import hiber.model.Car;
import java.util.List;

public interface UserService {
    void add(User user);

    void add(Car car);

    User getCar(String str,int series);
    List<User> listUsers();
}
