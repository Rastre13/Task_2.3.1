package web.service;

import web.model.User;

import java.util.List;

public interface UserService {
    List<User> getAllUsers();
    User getById(Long id);
    void addUser(User user);
    void deleteUser(Long id);
    void changeUser(User updateUser);
}
