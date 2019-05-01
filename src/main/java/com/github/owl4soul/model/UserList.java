package com.github.owl4soul.model;

import com.github.owl4soul.interfaces.Observer;

import java.util.ArrayList;
import java.util.List;

//Bidder to observe User
@Deprecated
public class UserList implements Observer {
    public static UserList userListSingletone;
    private static List<User> userList = new ArrayList<>();

    private UserList() {

    }

    public static UserList initUserList() {
        if (userListSingletone == null) {
            userListSingletone = new UserList();
            return userListSingletone;
        }
        return userListSingletone;
    }

    public List<User> getUserList() {
        return userList;
    }

    public static void setUserList(List<User> userList) {
        UserList.userList = userList;
    }

    public User getUserByUsername(String userName) {
        for (int i = 0; i < userList.size(); i++) {
            if (userList.get(i).getUserName().equals(userName)) {
                return userList.get(i);
            }
        }
        return null;
    }

    @Override
    public void update(Observer observer, User user) {
        userList.add(user);
        System.out.println("user added to list"); //todo remove it later
    }

}
