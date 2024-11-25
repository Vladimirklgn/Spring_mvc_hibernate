package web.service;

import web.entity.User;

import java.util.List;

public interface UserService {
    List<User> getUsers();
    User getUser(Long id);
    void addUser(User user);
    void updateUser(User user);
    void deleteUser(Long id);
}
