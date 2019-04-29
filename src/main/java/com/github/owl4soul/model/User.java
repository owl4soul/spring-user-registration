package com.github.owl4soul.model;

import com.github.owl4soul.interfaces.Observer;
import com.github.owl4soul.interfaces.Subject;

import java.util.ArrayList;
import java.util.List;

public class User implements Subject {
    private static List<Observer> observers = new ArrayList<>();
    private Observer observer;

    private static long counter = 0;

    private long id;
    private String userName;
    private String firstName;
    private String lastName;
    private long phone;

    public User() {

    }

    public User(UserBuilder userBuilder) {
        this.id = ++counter;
        this.userName = userBuilder.userName;
        this.firstName = userBuilder.firstName;
        this.lastName = userBuilder.lastName;
        this.phone = userBuilder.phone;
        this.notifyObservers();
    }

    public long getId() {
        return id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public long getPhone() {
        return phone;
    }

    public void setPhone(long phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        String toString = "{"
                + "username: " + userName + " | "
                + "first name: " + firstName + " | "
                + "last name: " + lastName + " | "
                + "phone: " + phone + "}";
        return toString;
    }

    @Override
    public void registerObserver(Observer observer) {
        if (!observers.contains(observer)) {
            observers.add(observer);
            System.out.println("observer has been registered");
        }
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer obs : observers) {
            obs.update(this.observer, this);
        }
    }

    //Builder
    public static class UserBuilder {
        private String userName;
        private String firstName;
        private String lastName;
        private long phone;

        public UserBuilder _userName(String userName) {
            this.userName = userName;
            return this;
        }
        public UserBuilder _firstName(String firstName) {
            this.firstName = firstName;
            return this;
        }
        public UserBuilder _lastName(String lastName) {
            this.lastName = lastName;
            return this;
        }
        public UserBuilder _phone(long phone) {
            this.phone = phone;
            return this;
        }

        public User build() {
            return new User(this);
        }
    }

}
