package com.github.owl4soul.model;

import org.hibernate.annotations.NaturalId;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;

@Entity
@Table(name = "user_account")
public class User {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @NotNull
    @NaturalId
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
