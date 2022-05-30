package web.dao;

import web.model.User;

import java.util.List;

public interface UserDao {
    List<User> getAllUsers();
    User getById(Long id);
    void addUser(User user);
    void deleteUser(Long id);
    void changeUser(User updateUser);
}
