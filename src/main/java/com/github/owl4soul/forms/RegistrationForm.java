package com.github.owl4soul.forms;

import com.github.owl4soul.validation.FieldMatch;
import com.github.owl4soul.validation.PhoneValidatorConstraint;

import com.github.owl4soul.validation.UserPasswordConstraint;
import org.hibernate.validator.constraints.NotEmpty;


import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//
//@FieldMatch.List({
//        @FieldMatch(first = "password", second = "confirmPassword", message = "The password fields must match"),
//
//})

@FieldMatch(first = "password", second = "confirmPassword", message = "The password fields must match")
public class RegistrationForm {



    @NotNull
    @Size(max = 3) //todo for tests only, change it later
    private String name;

    @NotEmpty
    private String password;
    @NotEmpty
    private String confirmPassword;
    private String first;
    private String last;
    //    @Digits(integer = 12, fraction = 0, message = "No more than 12 characters")
    @PhoneValidatorConstraint
    private long phone;
    private String email;

//    @UserPasswordConstraint
//    public List<String> passwords;

//    public RegistrationForm() {
//        super();
//        passwords.add("asda");
//        passwords.add("asadsada");
//    }

//    public RegistrationForm(String password, String confirmPassword) {
//        this.password = password;
//        this.confirmPassword = confirmPassword;
//        passwords.add(password);
//        passwords.add(confirmPassword);
//    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getConfirmPassword() {
        return confirmPassword;
    }

    public void setConfirmPassword(String confirmPassword) {
        this.confirmPassword = confirmPassword;
    }

    public String getFirst() {
        return first;
    }

    public void setFirst(String first) {
        this.first = first;
    }

    public String getLast() {
        return last;
    }

    public void setLast(String last) {
        this.last = last;
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

//    public List<String> getPasswords() {
//        System.out.println("get");
//        return null;
//    }
//
//    public void setPasswords(List<String> values) {
//        System.out.println("set");
//    }
}
