package web.dao;

import org.springframework.stereotype.Repository;
import web.entity.User;

import java.util.List;

@Repository
public interface UserDao {
    List<User> getUsers();
    User getUser(Long id);
    void addUser(User user);
    void updateUser(User user);
    void deleteUser(Long id);
}
