package edu.miu.springConnData.Service;

import edu.miu.springConnData.Entity.User;

import java.util.List;

public interface UserService {

    List<User> getUsers();
    User getUser(Long Id);
    void deleteUser(Long Id);
    void saveUser(User user);
    void updateUser(User user);

}
