package com.github.owl4soul.services;

import com.github.owl4soul.model.User;
import com.github.owl4soul.repository.UserDAO;

import java.util.List;

public class UserService {
    private UserDAO userDAO = new UserDAO();

    public UserService() {
    }

    public UserService(UserDAO UserDAO) {
        this.userDAO = UserDAO;
    }

    public void saveUser(User User) {
        userDAO.save(User);
    }

    public void deleteUser(User User) {
        userDAO.delete(User);

    }

    public void updateUser(User User) {
        userDAO.update(User);
    }

    public void mergeUser(User User, User changed) {
        userDAO.merge(User, changed);
    }

    public List<User> findAllUsers() {
        return userDAO.findAllUsers();
    }

    public User findUserById(int id) {
        return userDAO.findUserById(id);
    }

    public List<User> findByUsername(String likeName) {
        return userDAO.findByUsername(likeName);
    }
}
