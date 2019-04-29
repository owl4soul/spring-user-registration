package com.github.owl4soul.model;

import com.github.owl4soul.interfaces.Observer;

import java.util.ArrayList;
import java.util.List;

//Bidder to observe User
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

    public static List<User> getUserList() {
        return userList;
    }

    public static void setUserList(List<User> userList) {
        UserList.userList = userList;
    }

    @Override
    public void update(Observer observer, User user) {
        userList.add(user);
        System.out.println("user added to list"); //todo remove it later
    }
}
