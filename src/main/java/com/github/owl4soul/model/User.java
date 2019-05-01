package com.github.owl4soul.model;

import com.github.owl4soul.interfaces.Observer;
import com.github.owl4soul.interfaces.Subject;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "user_account")
public class User {
//    private static List<Observer> observers = new ArrayList<>();
//    private Observer observer;

//    private static long counter = 0;

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @NotNull
    @Column(name = "username")
    private String userName;


    @Column(name = "firstname")
    private String firstName;


    @Column(name = "lastname")
    private String lastName;


    @Column(name = "phone")
    private long phone;

    @NotNull
    @Column(name = "email")
    private String email;

    @NotNull
    @Column(name = "date")
    private LocalDateTime dateTime;

    public User() {

    }

    public User(UserBuilder userBuilder) {
        this.userName = userBuilder.userName;
        this.firstName = userBuilder.firstName;
        this.lastName = userBuilder.lastName;
        this.phone = userBuilder.phone;
        this.email = userBuilder.email;
        this.dateTime = LocalDateTime.now();

//        this.notifyObservers(); //todo remove it
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    public void setDateTime(LocalDateTime dateTime) {
        this.dateTime = dateTime;
    }

    @Override
    public String toString() {
        String toString = "{"
                + "id: " + id + " | "
                + "username: " + userName + " | "
                + "first name: " + firstName + " | "
                + "last name: " + lastName + " | "
                + "phone: " + phone + " | "
                + "email: " + email + "}";
        return toString;
    }

//    @Override
//    public void registerObserver(Observer observer) {
//        if (!observers.contains(observer)) {
//            observers.add(observer);
//            System.out.println("observer has been registered");
//        }
//    }
//
//    @Override
//    public void removeObserver(Observer observer) {
//        observers.remove(observer);
//    }
//
//    @Override
//    public void notifyObservers() {
//        for (Observer obs : observers) {
//            obs.update(this.observer, this);
//        }
//    }

    //Builder
    public static class UserBuilder {
        private String userName;
        private String firstName;
        private String lastName;
        private long phone;
        private String email;

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

        public UserBuilder _email(String email) {
            this.email = email;
            return this;
        }

        public User build() {
            return new User(this);
        }
    }

}
